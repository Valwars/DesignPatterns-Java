package TD.Ex2.V2.Adapteur;

import TD.Ex2.V2.SuperviseurPlateauI;
import TD.Ex2.V2.UnEchiquierImpl;

public class SPlateauAdapter implements SuperviseurPlateauI {

    UnEchiquierImpl echiquier;

    public SPlateauAdapter(UnEchiquierImpl echiquier){
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
