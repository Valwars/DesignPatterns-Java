package TD.Ex2.Bridge;

import TD.Ex2.Interfaces.PlateauI;

public class SuperviseurConcret extends SuperviseurAbstrait{
    public SuperviseurConcret(PlateauI plateau){
        super(plateau);
    }
    @Override
    public void superviser() {
        this.interrompre();
        System.out.println("Superviser");
        this.reprendre();
    }
}
