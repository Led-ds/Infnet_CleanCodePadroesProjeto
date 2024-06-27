package br.empresa.com.models.clazz;

import br.empresa.com.models.abstracts.Funcionario;

public class FuncionarioTercerizado extends Funcionario {
    private String empresaContratada;

    public FuncionarioTercerizado(final String prEmpresaContratada, final FuncionarioModelo prModelo) {
        super(prModelo);
        this.empresaContratada = prEmpresaContratada;
    }

    public String getEmpresaContratada() {
        return empresaContratada;
    }

    public void setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
    }

    @Override
    public String toString() {
        return "FuncionarioTercerizado { " +
                "empresaContratada='" + empresaContratada + '\'' +
                ", modelo=" + getModelo() +
                '}';
    }

}
