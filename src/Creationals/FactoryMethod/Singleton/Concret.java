package Creationals.FactoryMethod.Singleton;

public class Concret {

    private static Concret instance = null;

    private Concret() {
        // Constructor
    }

    public static Concret getInstance() {
        if (instance == null) {
            instance = new Concret();
        }
        return instance;
    }
}
