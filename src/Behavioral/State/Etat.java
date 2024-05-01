package Behavioral.State;

public abstract class Etat {
    public abstract Etat turnOff();
    public abstract Etat turnOn();
    public abstract Etat maintenance();
}
