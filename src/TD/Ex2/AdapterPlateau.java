package TD.Ex2;

import TD.Ex2.Interfaces.PlateauI;

public class AdapterPlateau implements PlateauI {
    // pour la partie 2 (pas finis)
    private Plateau plateau;

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

    @Override
    public void obtenir() {
        plateau.obtenir();
    }

    @Override
    public void deplacer() {
        plateau.deplacer();
    }
}
