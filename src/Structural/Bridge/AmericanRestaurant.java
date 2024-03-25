package Structural.Bridge;

import Structural.Bridge.Pizza.Pizza;

public class AmericanRestaurant extends Restaurant{

    public AmericanRestaurant(Pizza pizza){
        super(pizza);
    }
    @Override
    void addSauce() {
        pizza.setSauce("Super secret sauce");
    }

    @Override
    void addTopping() {
        pizza.setTopping("Everything");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
