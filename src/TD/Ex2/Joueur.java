package TD.Ex2;

import TD.Ex2.Interfaces.JoueurActions;

public class Joueur implements JoueurActions {
    private Plateau plateau;

    public Joueur(Plateau plateau) {
        this.plateau = plateau;
    }

    @Override
    public void obtenir() {
        plateau.obtenir();
    }

    @Override
    public void deplacer() {
        plateau.deplacer();
    }
}
