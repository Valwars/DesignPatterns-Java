package TD.Ex2.V2.memento;

import TD.Ex2.V2.Echiquier;

public class EchiquierControllable extends Echiquier implements Controllable {

    private Disposition disposition;
    private Memento m;

    public EchiquierControllable() {
        super();
        disposition = new Disposition();
        m =  getMemento();
    }

    public void save() {
        m = getMemento();
    }

    @Override
    public Memento getMemento() {
        return new Memento(disposition);
    }

    @Override
    public void restaure(Memento memento) {
        try{
            disposition = memento.getDisposition();
        } catch (ClassCastException e) {
            System.out.println("Mauvais type de memento");
        }
    }

}
