package br.empresa.com.factory;

import br.empresa.com.modelo.abstracts.Funcionario;
import br.empresa.com.modelo.enums.Cargo;
import br.empresa.com.modelo.enums.Setor;
import br.empresa.com.modelo.enums.TipoEmpresa;

import java.util.List;

public class FuncionarioFactory {

    /* TODO
     *  ::identificando bad smells::
     *  -> Deixo de usar meu Factory neste momento, pois minha classe Builder já centraliza meus atributos; Confira a classe Main;
     * */
    public static Funcionario criarFuncionario(final TipoEmpresa prTipo, final String prEmpresaContratada, final String prNome, final List<String> prTelefones, final String prEndereco,
                                               final Double prSalario, final Setor prSetor, final Cargo prCargo) {

        if (TipoEmpresa.TERCEIRIZADO.equals(prTipo)) {
            //return new FuncionarioTercerizado(prEmpresaContratada, prNome, prTelefones, prEndereco, prSalario, prSetor, prCargo);
        } else {
            //return new Funcionario(prNome, prTelefones, prEndereco, prSalario, prSetor, prCargo){};
        }

        return null;
    }

}
