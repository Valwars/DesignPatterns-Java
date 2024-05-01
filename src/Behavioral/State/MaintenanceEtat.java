package Behavioral.State;

public class MaintenanceEtat extends Etat{
    @Override
    public Etat turnOff() {
        System.out.println("Phone is off");
        return new OffEtat();
    }

    @Override
    public Etat turnOn() {
        System.out.println("Phone is on");
        return new OnEtat();
    }

    @Override
    public Etat maintenance() {
        System.out.println("Phone i salready on maintenance");
        return this;
    }
}