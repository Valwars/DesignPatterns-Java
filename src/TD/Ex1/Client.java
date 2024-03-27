package TD.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        TelecommandeI telecommande = new Telecommande();
        // aucun moyen de communication entre les deux elements.
        LL1 ll1 = new LL1();
        telecommande.marche(true); // n'as aucun impact sur LL1.

        System.out.println("**********");
        // on créer un adapteur
        // L'Adapter Pattern est idéal pour ce scénario car il permet l'interaction entre
        // deux interfaces incompatibles sans modifier leur code source.
        Adapter telecommandeAdapter = new Adapter(ll1);
        telecommandeAdapter.xxx("setProg", 3); // Définit le programme de lavage
        telecommandeAdapter.xxx("setLength", 45); // Définit la durée de lavage
        telecommandeAdapter.marche(true); // LL1 est en marche.

        System.out.println("**********");

        // on créer un adapteur multi qui commande plusieurs LL1 avec une seule telecommande.
        List<LL1> laveLinges = new ArrayList<>();
        laveLinges.add(new LL1());
        laveLinges.add(new LL1());
        TelecommandeI telecommandeMultiAdapter = new MultiAdapter(laveLinges);
        telecommandeMultiAdapter.xxx("setProg", 3); // Définit le programme de lavage
        telecommandeMultiAdapter.xxx("setLength", 45); // Définit la durée de lavage
        telecommandeMultiAdapter.marche(true); // LL1 est en marche.
    }

}
