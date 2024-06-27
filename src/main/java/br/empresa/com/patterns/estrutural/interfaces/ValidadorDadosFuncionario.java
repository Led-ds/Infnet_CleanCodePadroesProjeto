package br.empresa.com.patterns.estrutural.interfaces;

import br.empresa.com.models.clazz.FuncionarioModelo;

public interface ValidadorDadosFuncionario {
    boolean validarDados(final FuncionarioModelo prFuncionario);
}
