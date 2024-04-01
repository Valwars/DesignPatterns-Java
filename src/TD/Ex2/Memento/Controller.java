package TD.Ex2.Memento;

import Behavioral.Memento.TextArea;
import TD.Ex2.Echiquier;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Controller {

    private Echiquier echiquier;
    private Deque<Echiquier.Memento> stateHistory;

    public Controller(Echiquier echiquier) {
        this.echiquier = echiquier;
        this.stateHistory = new LinkedList<>();
    }

    public Echiquier getEchiquier() {
        return echiquier;
    }
    public void save() {
        stateHistory.add(echiquier.save());
    }

    public void restore() {
        echiquier.restore(stateHistory.pop());
    }
}
