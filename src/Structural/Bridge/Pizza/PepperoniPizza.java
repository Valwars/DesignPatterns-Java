package Structural.Bridge.Pizza;

public class PepperoniPizza extends Pizza{
    @Override
    public void assemble() {
        System.out.println("Adding sauce : " + sauce);
        System.out.println("Adding topping : " + topping);
        System.out.println("Adding peperonni");
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is : " + crust);
    }
}
