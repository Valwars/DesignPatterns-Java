package TD.Ex2.V2;

import TD.Ex2.V2.Adapteur.JPlateauAdapter;
import TD.Ex2.V2.Adapteur.SPlateauAdapter;
import TD.Ex2.V2.Proxy.JPlateauProxy;

public class Client {

    public static void main(String[] args) {

        //1
        Echiquier echiquier = new Echiquier();
        Joueur j1 = new Joueur(echiquier);
        Superviseur s1 = new Superviseur(echiquier);


        //2
        UnEchiquierImpl echiquierImpl = new UnEchiquierImpl();

        JoueurPlateauI jPlateauAdapter = new JPlateauAdapter(echiquierImpl);
        Joueur j2 = new Joueur(jPlateauAdapter);

        SuperviseurPlateauI sPlateauAdapter = new SPlateauAdapter(echiquierImpl);
        Superviseur s2 = new Superviseur(sPlateauAdapter);


        // 3
        JPlateauProxy jPlateauProxy = new JPlateauProxy(echiquier);
        Joueur j3 = new Joueur(jPlateauProxy);


        // 4

    }
}
