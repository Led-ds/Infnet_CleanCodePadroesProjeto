package br.empresa.com.services;

public class ValidadorDadosFuncionarioService {

    public boolean verificar(final String prNome, final String prEndereco) {
        return prNome != null && !prNome.isEmpty() && prEndereco != null && !prEndereco.isEmpty();
    }

}
