package br.empresa.com.modelo.builder;

import br.empresa.com.modelo.abstracts.Funcionario;
import br.empresa.com.modelo.clazz.FuncionarioModelo;
import br.empresa.com.modelo.clazz.FuncionarioTercerizado;
import br.empresa.com.modelo.enums.Cargo;
import br.empresa.com.modelo.enums.Setor;

import java.util.List;

public class FuncionarioBuilder {
    private FuncionarioModelo modelo;
    private String empresaContratada;

    public FuncionarioBuilder(){
        this.modelo = new FuncionarioModelo();
    }

    public FuncionarioBuilder setNome(String nome) {
        this.modelo.setNome(nome);
        return this;
    }

    public FuncionarioBuilder setTelefones(List<String> telefones) {
        this.modelo.setTelefones(telefones);
        return this;
    }

    public FuncionarioBuilder setEndereco(String endereco) {
        this.modelo.setEndereco(endereco);
        return this;
    }

    public FuncionarioBuilder setSalario(Double salario) {
        this.modelo.setSalario(salario);
        return this;
    }

    public FuncionarioBuilder setSetor(Setor setor) {
        this.modelo.setSetor(setor);
        return this;
    }

    public FuncionarioBuilder setCargo(Cargo cargo) {
        this.modelo.setCargo(cargo);
        return this;
    }

    public FuncionarioBuilder setEmpresaContratada(String empresaContratada) {
        this.empresaContratada = empresaContratada;
        return this;
    }

    public Funcionario build() {
        if (empresaContratada == null) {
            return new Funcionario(modelo){};
        } else {
            return new FuncionarioTercerizado(empresaContratada, modelo);
        }
    }
}
