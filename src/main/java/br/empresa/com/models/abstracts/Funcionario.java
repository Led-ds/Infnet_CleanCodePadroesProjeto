package br.empresa.com.models.abstracts;

import br.empresa.com.models.clazz.FuncionarioModelo;

public abstract class Funcionario {
    private FuncionarioModelo modelo;
    public Funcionario(){}
    public Funcionario(final FuncionarioModelo prModelo) { // O construtor agora recebe apenas um parametro, e com isso reduzimos a chance de possiveis erros;
        this.modelo = prModelo;
    }

    public FuncionarioModelo getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Funcionario { " +
                "modelo=" + modelo +
                '}';
    }

}
