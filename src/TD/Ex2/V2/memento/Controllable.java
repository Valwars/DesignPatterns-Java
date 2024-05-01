package TD.Ex2.V2.memento;

public interface Controllable {
    Memento getMemento();
    void restaure(Memento memento);
}
