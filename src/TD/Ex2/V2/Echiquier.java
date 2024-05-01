package TD.Ex2.V2;

import java.util.Deque;
import java.util.List;

public class Echiquier implements JoueurPlateauI, SuperviseurPlateauI{


    @Override
    public void initialiser() {
        System.out.println("Initialiser");
    }

    @Override
    public void extraire() {
        System.out.println("Extraire");
    }

    @Override
    public void disposer() {
        System.out.println("Disposer");
    }

    @Override
    public void obtenir() {
        System.out.println("Obtenir");
    }

    @Override
    public void deplacer() {
        System.out.println("Deplacer");
    }
}
