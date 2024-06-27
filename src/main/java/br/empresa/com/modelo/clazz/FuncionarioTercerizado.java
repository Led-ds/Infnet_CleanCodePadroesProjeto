package br.empresa.com.modelo.clazz;

import br.empresa.com.modelo.abstracts.Funcionario;

public class FuncionarioTercerizado extends Funcionario {
    private String empresaContratada;

    public FuncionarioTercerizado(final String prEmpresaContratada, FuncionarioModelo modelo) {
        super(modelo);
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

    /* TODO
     *  ::identificando bad smells::
     *  -> O metodo toString()
     * */
//    @Override
//    public String toString() {
//        return "Tercerizado {" +
//                "empresaContratada='" + empresaContratada + '\'' +
//                ", nome='" + getNome() + '\'' +
//                ", telefones=" + getTelefones() +
//                ", endereco='" + getEndereco() + '\'' +
//                ", salario=" + getSalario() +
//                ", setor=" + getSetor() +
//                ", cargo='" + getCargo() + '\'' +
//                '}';
//    }
}
