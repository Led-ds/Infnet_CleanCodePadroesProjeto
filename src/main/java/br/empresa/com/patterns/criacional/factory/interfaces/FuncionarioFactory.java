package br.empresa.com.patterns.criacional.factory.interfaces;

import br.empresa.com.models.abstracts.Funcionario;
import br.empresa.com.models.clazz.FuncionarioModelo;

public interface FuncionarioFactory {
    Funcionario criarFuncionario(final FuncionarioModelo prFuncionario, final String prEmpresaContratada);
}