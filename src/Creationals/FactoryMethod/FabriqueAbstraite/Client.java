package Creationals.FactoryMethod.FabriqueAbstraite;

public class Client {

    public static void main(String[] args) {
        FrabriqueConcrete1 fabrique1 = new FrabriqueConcrete1();
        ProduitA produitA1 = fabrique1.createProductA();
        ProduitB produitB1 = fabrique1.createProductB();
    }
}
