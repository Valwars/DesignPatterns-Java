package TD.Ex2;

import TD.Ex2.Interfaces.SuperviseurActions;

public class Superviseur implements SuperviseurActions {
    private Plateau plateau;

    public Superviseur(Plateau plateau) {
        this.plateau = plateau;
    }

    @Override
    public void initialiser() {
        plateau.initialiser();
    }

    @Override
    public void extraire() {
        plateau.extraire();
    }

    @Override
    public void disposer() {
        plateau.disposer();
    }
}
