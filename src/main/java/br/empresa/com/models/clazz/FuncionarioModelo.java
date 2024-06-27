package br.empresa.com.models.clazz;

import br.empresa.com.models.enums.Cargo;
import br.empresa.com.models.enums.Setor;

import java.util.List;

public class FuncionarioModelo {
    private String nome;
    private List<String> telefones;
    private String endereco;
    private Double salario;
    private Setor setor;
    private Cargo cargo;

    public FuncionarioModelo(){}
    public FuncionarioModelo(final String prNome, final List<String> prTelefones, final String prEndereco, final Double prSalario, final Setor prSetor, final Cargo prCargo) {
        this.nome = prNome;
        this.telefones = prTelefones;
        this.endereco = prEndereco;
        this.salario = prSalario;
        this.setor = prSetor;
        this.cargo = prCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<String> telefones) {
        this.telefones = telefones;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "FuncionarioModelo{" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                ", setor=" + setor +
                ", cargo=" + cargo +
                '}';
    }
}
