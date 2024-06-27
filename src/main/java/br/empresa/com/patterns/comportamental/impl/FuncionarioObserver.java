package br.empresa.com.patterns.comportamental.impl;

import br.empresa.com.models.abstracts.Funcionario;
import br.empresa.com.patterns.comportamental.interfaces.ObserverNotificacao;

public class FuncionarioObserver implements ObserverNotificacao {

    @Override
    public void update(final Funcionario prFuncionario) {
        System.out.println("Temos um novo funcionário (Observer): " + prFuncionario);
        System.out.println("");
    }
}
