package TD.Ex4;

public class RobotT1 implements Pilotable{

    public void left() {
        System.out.println(new java.util.Date().getTime()+" GAUCHE");
    }
    public void right() {
        System.out.println(new java.util.Date().getTime()+" DROITE");
    }
    public void move(int n) {
        System.out.println(new java.util.Date().getTime()+" AVANCE DE "+n);
    }
}
