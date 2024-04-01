package TD.Ex2;

import TD.Ex2.Interfaces.PlateauI;

public class Echiquier implements PlateauI {

    public PlateauI plateau;

    @Override
    public void initialiser() {

    }

    @Override
    public void extraire() {

    }

    @Override
    public void disposer() {

    }

    @Override
    public void obtenir() {

    }

    @Override
    public void deplacer() {

    }

    public Memento save() {
        return new Memento(this);
    }

    public void restore(Memento m) {
        this.plateau = m.getSavedState();
    }

    public static class Memento {
        private PlateauI state;

        public Memento(PlateauI stateToSave) {
            state = stateToSave;
        }

        public PlateauI getSavedState() {
            return state;
        }
    }
}
