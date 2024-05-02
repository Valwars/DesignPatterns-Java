package Structural.Facade;

public class Facade {

    private System1 system1;
    private System2 system2;

    public Facade() {
        system1 = new System1();
        system2 = new System2();
    }

    public void operation1() {
        system1.operation1();
        system2.operation1();
    }

    public void operation2() {
        system1.operation2();
        system2.operation2();
    }

}
