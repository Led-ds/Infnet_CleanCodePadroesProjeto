package br.empresa.com.modelo.abstracts;

import br.empresa.com.modelo.enums.Cargo;
import br.empresa.com.modelo.enums.Setor;

import java.util.List;

public abstract class Funcionario {

    private String nome;
    private List<String> telefones;
    private String endereco;
    private Double salario;
    private Setor setor;
    private Cargo cargo;

    public Funcionario(){}


    /* TODO
     *  ::identificando bad smells::
     *  -> O metodo construtor() têm muitos parâmetros, tanto aqui em Funcionário
     *  quanto na class Funcionário Terceirizado
     * */
    public Funcionario(final String prNome, final List<String> prTelefones, final String prEndereco, final Double prSalario, final Setor prSetor, final Cargo prCargo) {
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




    /* TODO
     *  ::identificando bad smells::
     *  -> O metodo toString() tem código repetido tanto aqui em Funcionário
     *  quanto na class Funcionário Terceirizado
     * */
    @Override
    public String toString() {
        return "Funcionario {" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                ", setor=" + setor +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
