package TD.Ex2;

import TD.Ex2.Interfaces.JoueurActions;
import TD.Ex2.Interfaces.PlateauI;

public class Joueur implements JoueurActions {
    private PlateauI echiquier;

    public Joueur(PlateauI echiquier) {
        this.echiquier = echiquier;
    }

    @Override
    public void obtenir() {
        echiquier.obtenir();
    }

    @Override
    public void deplacer() {
        echiquier.deplacer();
    }
}
