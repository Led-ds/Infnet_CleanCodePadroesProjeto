package br.empresa.com.patterns.criacional.factory.impl;

import br.empresa.com.patterns.criacional.factory.interfaces.FuncionarioFactory;
import br.empresa.com.models.abstracts.Funcionario;
import br.empresa.com.models.clazz.FuncionarioModelo;
import br.empresa.com.models.clazz.FuncionarioTercerizado;

public class FuncionarioTercerizadoFactory implements FuncionarioFactory {
    @Override
    public Funcionario criarFuncionario(final FuncionarioModelo prFuncionario, final String prEmpresaContratada) {
        return new FuncionarioTercerizado(prEmpresaContratada, prFuncionario);
    }
}
