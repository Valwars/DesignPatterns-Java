package TD.Ex2.V2.memento;

public class Memento implements OpaqueMemento{
    private Disposition disposition;

    public Memento(Disposition disposition){
        this.disposition = disposition;
    }

    public Disposition getDisposition() {
        return disposition;
    }
}
