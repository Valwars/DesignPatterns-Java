package TD.Ex1;

public class LL1 {

    public boolean isOn = false;
    public int progNumber = 0;
    public int progLength = 0;

    public void on() {
        System.out.println("LL1 is on");
        isOn = true;
    }
    public void off() {
        System.out.println("LL1 is off");
        isOn = false;
    }
    public void setProgNumber(int progNumber) {
        this.progNumber = progNumber;
        System.out.println("Programme de lavage défini à " + progNumber);

    }

    public void setLength(int progLength) {
        this.progLength = progLength;
        System.out.println("Durée de lavage définie à " + progLength + " minutes");

    }
}
