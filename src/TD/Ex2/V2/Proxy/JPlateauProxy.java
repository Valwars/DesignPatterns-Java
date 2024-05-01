package TD.Ex2.V2.Proxy;

import TD.Ex2.V2.JoueurPlateauI;

public class JPlateauProxy implements JoueurPlateauI {

    private JoueurPlateauI echiquier;

    private boolean isWhite = false;
    public JPlateauProxy(JoueurPlateauI echiquier){
        this.echiquier = echiquier;
    }

    @Override
    public void obtenir() {
        if(isWhite){
            echiquier.obtenir();
        }else{
            System.out.println("You are not allowed to get");
        }
    }

    @Override
    public void deplacer() {
        if(isWhite){
            echiquier.deplacer();
        }else{
            System.out.println("You are not allowed to move");
        }
    }
}
