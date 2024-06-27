package br.empresa.com.patterns.comportamental;

import br.empresa.com.models.abstracts.Funcionario;

public class FuncionarioNotifier extends SubjectNotificacao{
    public void adicionarFuncionario(final Funcionario prFuncionario) {
        notifyObservers(prFuncionario);
    }
}
