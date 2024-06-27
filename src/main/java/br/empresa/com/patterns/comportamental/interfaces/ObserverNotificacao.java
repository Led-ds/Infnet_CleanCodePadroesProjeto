package br.empresa.com.patterns.comportamental.interfaces;

import br.empresa.com.models.abstracts.Funcionario;

public interface ObserverNotificacao {
    void update(final Funcionario prFuncionario);
}
