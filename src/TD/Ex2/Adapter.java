package TD.Ex2;

import TD.Ex2.Interfaces.PlateauI;

public class Adapter implements PlateauI {

    UnEchiquierImpl echiquier;
    public Adapter(UnEchiquierImpl echiquier){
        this.echiquier = echiquier;
    }
    @Override
    public void initialiser() {
        echiquier.initialiser();
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
}
