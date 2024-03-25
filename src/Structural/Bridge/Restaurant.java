package Structural.Bridge;

import Structural.Bridge.Pizza.Pizza;

public abstract class Restaurant {

    // pizza is the bridge, instead of AmericanPizza, we have a type in the restaurant wich have a pizza object.
    protected Pizza pizza;
    protected Restaurant(Pizza pizza){
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addTopping();
    abstract void makeCrust();

    public void deliver(){
        makeCrust();
        addSauce();
        addTopping();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in progress !");
    }

}
