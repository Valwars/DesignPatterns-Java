package TD.Ex2.V2.Adapteur;

import TD.Ex2.V2.JoueurPlateauI;
import TD.Ex2.V2.UnEchiquierImpl;

public class JPlateauAdapter implements JoueurPlateauI {

    UnEchiquierImpl echiquier;

    public JPlateauAdapter(UnEchiquierImpl echiquier){
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
