package br.empresa.com;

import br.empresa.com.factory.FuncionarioFactory;
import br.empresa.com.modelo.abstracts.Funcionario;
import br.empresa.com.modelo.enums.Cargo;
import br.empresa.com.modelo.enums.Setor;
import br.empresa.com.modelo.enums.TipoEmpresa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = FuncionarioFactory.criarFuncionario(TipoEmpresa.ACME, null, "Juliana Silva", Arrays.asList("(21) 3768-2178", "(21) 98900-1100"), "Rua Casinha Vermelha, 28", 5000.0, Setor.DESENVOLVIMENTO, Cargo.PLENO);
        Funcionario tercerizado = FuncionarioFactory.criarFuncionario(TipoEmpresa.TERCEIRIZADO, "Any21", "Axel Soares", Arrays.asList("(21) 2309-2100", "(22) 99901-8902"), "Av. Padre Canabrava, 20", 3750.50, Setor.BANCO_DE_DADOS, Cargo.SENIOR);

        System.out.println(funcionario.toString());
        System.out.println("");
        System.out.println(tercerizado.toString());

    }
}