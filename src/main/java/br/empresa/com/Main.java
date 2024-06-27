package br.empresa.com;

import br.empresa.com.modelo.abstracts.Funcionario;
import br.empresa.com.modelo.builder.FuncionarioBuilder;
import br.empresa.com.modelo.enums.Cargo;
import br.empresa.com.modelo.enums.Setor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Funcionario funcionario = FuncionarioFactory.criarFuncionario(TipoEmpresa.ACME, null, "Juliana Silva", Arrays.asList("(21) 3768-2178", "(21) 98900-1100"), "Rua Casinha Vermelha, 28", 5000.0, Setor.DESENVOLVIMENTO, Cargo.PLENO);
        //Funcionario tercerizado = FuncionarioFactory.criarFuncionario(TipoEmpresa.TERCEIRIZADO, "Any21", "Axel Soares", Arrays.asList("(21) 2309-2100", "(22) 99901-8902"), "Av. Padre Canabrava, 20", 3750.50, Setor.BANCO_DE_DADOS, Cargo.SENIOR);


        Funcionario funcionario = new FuncionarioBuilder()
                .setNome("João")
                .setTelefones(Arrays.asList("(21) 3768-2178", "(21) 98900-1100"))
                .setEndereco("Rua Casinha Vermelha, 28")
                .setSalario(1800.00)
                .setSetor(Setor.DESENVOLVIMENTO)
                .setCargo(Cargo.ESTAGIARIO)
                .build();


        Funcionario tercerizado = new FuncionarioBuilder()
                .setNome("Maria")
                .setTelefones(Arrays.asList("1122334455", "5566778899"))
                .setEndereco("Av. Padre Canabrava, 20")
                .setSalario(15000.00)
                .setSetor(Setor.DEVOPS)
                .setCargo(Cargo.SENIOR)
                .setEmpresaContratada("Any21")
                .build();

        System.out.println(funcionario.toString());
        System.out.println("");
        System.out.println(tercerizado.toString());

    }
}