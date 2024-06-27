package br.empresa.com.patterns.estrutural.impl;

import br.empresa.com.models.clazz.FuncionarioModelo;
import br.empresa.com.patterns.estrutural.interfaces.ValidadorDadosFuncionario;
import br.empresa.com.services.ValidadorDadosFuncionarioService;

public class ValidadorDadosFuncionarioAdapter implements ValidadorDadosFuncionario {
    private ValidadorDadosFuncionarioService servicoExterno;

    public ValidadorDadosFuncionarioAdapter(final ValidadorDadosFuncionarioService prServicoExterno) {
        this.servicoExterno = prServicoExterno;
    }
    @Override
    public boolean validarDados(final FuncionarioModelo prFuncionario) {
        return servicoExterno.verificar(prFuncionario.getNome(), prFuncionario.getEndereco());
    }
}
