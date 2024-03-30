package TD.Ex2;

import TD.Ex2.Interfaces.PlateauI;
import TD.Ex2.Interfaces.SuperviseurActions;

public class Superviseur implements SuperviseurActions {
    private PlateauI echiquier;

    public Superviseur(PlateauI echiquier) {
        this.echiquier = echiquier;
    }

    @Override
    public void initialiser() {
        echiquier.initialiser();
    }

    @Override
    public void extraire() {
        echiquier.extraire();
    }

    @Override
    public void disposer() {
        echiquier.disposer();
    }
}
