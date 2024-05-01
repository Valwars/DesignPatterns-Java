package Behavioral.State;

public class OffEtat extends Etat{

    @Override
    public Etat turnOff() {
       System.out.println("Phone is already off");
       return this;
    }

    @Override
    public Etat turnOn() {
        System.out.println("Phone is on");
        return new OnEtat();
    }

    @Override
    public Etat maintenance() {
      System.out.println("Phone is on maintenance");
        return new MaintenanceEtat();
    }
}
