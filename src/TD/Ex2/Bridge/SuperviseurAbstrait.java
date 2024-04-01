package TD.Ex2.Bridge;

import TD.Ex2.Interfaces.PlateauI;

public  abstract class SuperviseurAbstrait {

    public PlateauI plateau;

    public SuperviseurAbstrait(PlateauI plateau) {
        this.plateau = plateau;
    }
    public void interrompre() {
        System.out.println("Interrompre");
    }

    public void reprendre() {
        System.out.println("reprendre");
    }

    public abstract void superviser();

}
