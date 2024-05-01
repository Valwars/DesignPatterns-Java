package Behavioral.State;

public class Main {

    public static void main(String[] args){
        Phone phone = new Phone();
        phone.turnOff();
        phone.turnOn();
        phone.turnOn();
        phone.turnOff();
        phone.maintenance();
    }
}
