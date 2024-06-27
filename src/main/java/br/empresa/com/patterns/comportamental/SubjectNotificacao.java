package br.empresa.com.patterns.comportamental;

import br.empresa.com.models.abstracts.Funcionario;
import br.empresa.com.patterns.comportamental.interfaces.ObserverNotificacao;

import java.util.ArrayList;
import java.util.List;

public class SubjectNotificacao {

    private List<ObserverNotificacao> observerNotificacaos = new ArrayList<>();

    public void addObserver(final ObserverNotificacao prObserverNotificacao) {
        observerNotificacaos.add(prObserverNotificacao);
    }

    public void notifyObservers(final Funcionario prFuncionario) {
        for (ObserverNotificacao observerNotificacao : observerNotificacaos) {
            observerNotificacao.update(prFuncionario);
        }
    }

}
