package TD.Ex4;

public class Pilot {
    private Pilotable myPilotable;
    public void setMyPilotable(Pilotable myPilotable) {
        this.myPilotable = myPilotable;
    }
    public void play() {
        myPilotable.left();
        myPilotable.move(4);
        myPilotable.right();
        myPilotable.move(9);
        myPilotable.right();
    }
}