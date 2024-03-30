package TD.Ex2;

import TD.Ex2.Interfaces.PlateauI;

public class EchiquerProxy implements PlateauI {

    Echiquier echiquier;
    private boolean isWhite = true;
    public EchiquerProxy(Echiquier echiquier){
        this.echiquier = echiquier;
    }
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
        if(isWhite){
            System.out.println("Deplacer blanc");
        }else{
            System.out.println("Deplacer noir");
        }

        isWhite = !isWhite;
    }
}
