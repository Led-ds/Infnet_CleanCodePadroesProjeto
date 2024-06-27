package br.empresa.com.modelo.clazz;


import br.empresa.com.modelo.abstracts.Funcionario;
import br.empresa.com.modelo.enums.Cargo;
import br.empresa.com.modelo.enums.Setor;

import java.util.List;

public class FuncionarioTercerizado extends Funcionario {
    private String empresaContratada;

    public FuncionarioTercerizado(final String prEmpresaContratada, final String prNome, final List<String> prTelefones,
                                        final String prEndereco, final Double prSalario, final Setor prSetor, final Cargo prCargo) {

        super(prNome, prTelefones, prEndereco, prSalario, prSetor, prCargo);
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
        return "Tercerizado {" +
                "empresaContratada='" + empresaContratada + '\'' +
                ", nome='" + getNome() + '\'' +
                ", telefones=" + getTelefones() +
                ", endereco='" + getEndereco() + '\'' +
                ", salario=" + getSalario() +
                ", setor=" + getSetor() +
                ", cargo='" + getCargo() + '\'' +
                '}';
    }
}
