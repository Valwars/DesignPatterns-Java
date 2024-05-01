package Behavioral.State;

public class Phone {
    private Etat monEtat;

    public Phone(){
        monEtat = new OffEtat();
    }

    public void turnOn(){
        monEtat = monEtat.turnOn();
    }

    public void turnOff(){
        monEtat = monEtat.turnOff();
    }

    public void maintenance(){
        monEtat = monEtat.maintenance();
    }
}
