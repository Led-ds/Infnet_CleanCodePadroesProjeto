package br.empresa.com.modelo.abstracts;

import br.empresa.com.modelo.clazz.FuncionarioModelo;

public abstract class Funcionario {

    private FuncionarioModelo modelo;

    public Funcionario(FuncionarioModelo modelo) { // O construtor agora recebe apenas um parametro, e com isso reduzimos a chance de possiveis erros;
        this.modelo = modelo;
    }

    /* TODO
     *  ::identificando bad smells::
     *  -> O metodo construtor() têm muitos parâmetros, tanto aqui em Funcionário
     *  quanto na class Funcionário Terceirizado
     * */
    /*public Funcionario(final String prNome, final List<String> prTelefones, final String prEndereco, final Double prSalario, final Setor prSetor, final Cargo prCargo) {
        this.nome = prNome;
        this.telefones = prTelefones;
        this.endereco = prEndereco;
        this.salario = prSalario;
        this.setor = prSetor;
        this.cargo = prCargo;
    }*/

    public FuncionarioModelo getModelo() {
        return modelo;
    }

    @Override
    public String toString() { // O metodo toString() ficou mais enxuto sem duplicidade excessiva;
        return "Funcionario { " +
                "modelo=" + modelo +
                '}';
    }

    /* TODO
     *  ::identificando bad smells::
     *  -> O metodo toString() tem código repetido tanto aqui em Funcionário
     *  quanto na class Funcionário Terceirizado
     * */
    /*@Override
    public String toString() {
        return "Funcionario {" +
                "nome='" + nome + '\'' +
                ", telefones=" + telefones +
                ", endereco='" + endereco + '\'' +
                ", salario=" + salario +
                ", setor=" + setor +
                ", cargo='" + cargo + '\'' +
                '}';
    }*/
}
