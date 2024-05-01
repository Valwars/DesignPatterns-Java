package Behavioral.State;

public class OnEtat  extends Etat{
    @Override
    public Etat turnOff() {
        System.out.println("Phone is off");
        return new OffEtat();
    }

    @Override
    public Etat turnOn() {
        System.out.println("Phone is already on");
        return this;
    }

    @Override
    public Etat maintenance() {
        System.out.println("Phone is on maintenance");
        return new MaintenanceEtat();
    }
}