package br.empresa.com;

import br.empresa.com.models.abstracts.Funcionario;
import br.empresa.com.models.clazz.FuncionarioModelo;
import br.empresa.com.patterns.comportamental.FuncionarioNotifier;
import br.empresa.com.patterns.comportamental.impl.FuncionarioObserver;
import br.empresa.com.patterns.criacional.builder.FuncionarioBuilder;
import br.empresa.com.models.enums.Cargo;
import br.empresa.com.models.enums.Setor;
import br.empresa.com.patterns.criacional.factory.impl.FuncionarioDefaultFactory;
import br.empresa.com.patterns.criacional.factory.impl.FuncionarioTercerizadoFactory;
import br.empresa.com.patterns.criacional.factory.interfaces.FuncionarioFactory;
import br.empresa.com.patterns.estrutural.impl.ValidadorDadosFuncionarioAdapter;
import br.empresa.com.patterns.estrutural.interfaces.ValidadorDadosFuncionario;
import br.empresa.com.services.ValidadorDadosFuncionarioService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Contruindo observers
        FuncionarioNotifier notifier = new FuncionarioNotifier();
        notifier.adicionarFuncionario(new Funcionario(){});

        FuncionarioObserver observer = new FuncionarioObserver();
        notifier.addObserver(observer);


        //Contruindo Funcionarios com Builder
        Funcionario funcionarioBuilder = new FuncionarioBuilder()
                .setNome("João")
                .setTelefones(Arrays.asList("(21) 3768-2178", "(21) 98900-1100"))
                .setEndereco("Rua Casinha Vermelha, 28")
                .setSalario(1800.00)
                .setSetor(Setor.DESENVOLVIMENTO)
                .setCargo(Cargo.ESTAGIARIO)
                .build();


        Funcionario tercerizadoBuilder = new FuncionarioBuilder()
                .setNome("Maria")
                .setTelefones(Arrays.asList("(81) 2168-2178", "(81) 91901-1111"))
                .setEndereco("Av. Padre Canabrava, 20")
                .setSalario(15000.00)
                .setSetor(Setor.DEVOPS)
                .setCargo(Cargo.SENIOR)
                .setEmpresaContratada("Any21")
                .build();

        System.out.println(funcionarioBuilder.toString());
        System.out.println("");
        System.out.println(tercerizadoBuilder.toString());

        System.out.println("");



        //Dando inicio as fabricas de Funcionarios
        FuncionarioFactory defaultFactory = new FuncionarioDefaultFactory();
        FuncionarioFactory tercerizadoFactory = new FuncionarioTercerizadoFactory();

        // Detalhes do funcionário
        FuncionarioModelo funcionarioFactory = new FuncionarioModelo("Juliana Silva", Arrays.asList("(31) 3119-3380", "(31) 99911-8822"), "Rua Orta Silva, 102030", 3000.00, Setor.DESENVOLVIMENTO, Cargo.JUNIOR);
        FuncionarioModelo funcionarioTercerizadoFactory = new FuncionarioModelo("Axel Soares", Arrays.asList("(71) 2609-3103", "(71) 99900-0002"), "Avenida Zoe, s/n", 4000.00, Setor.BANCO_DE_DADOS, Cargo.PLENO);



        // Validando os detalhes do funcionário com o Adapter
        ValidadorDadosFuncionario validador = new ValidadorDadosFuncionarioAdapter(new ValidadorDadosFuncionarioService());

        if (validador.validarDados(funcionarioFactory)) {
            Funcionario funcionarioACME = defaultFactory.criarFuncionario(funcionarioFactory, null);
            notifier.adicionarFuncionario(funcionarioACME);
        }

        if (validador.validarDados(funcionarioTercerizadoFactory)) {
            Funcionario funcionarioTercerizado = tercerizadoFactory.criarFuncionario(funcionarioTercerizadoFactory, "BMW LTDA");
            notifier.adicionarFuncionario(funcionarioTercerizado);
        }

    }
}