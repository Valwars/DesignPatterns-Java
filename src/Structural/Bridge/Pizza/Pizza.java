package Structural.Bridge.Pizza;

public abstract class Pizza {
    protected String topping;
    protected String sauce;
    protected String crust;


    public abstract void assemble();
    public abstract void qualityCheck();

    public void setSauce(String oil) {
        this.sauce = oil;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    public void setCrust(String thin) {
        this.crust = thin;
    }
}
