package Creationals.FactoryMethod.FabriqueAbstraite;

public class FrabriqueConcrete1 implements Fabrique{

    @Override
    public ProduitA createProductA() {
        return new ConcreteProductA();
    }

    @Override
    public ProduitB createProductB() {
        return new ConcreteProductB();
    }
}
