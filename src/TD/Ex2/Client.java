package TD.Ex2;

import TD.Ex1.*;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // echiquer = new Plateau("Echiquer")
        // joueur = new Joueur(echiquer)
        // superviseur = new Superviseur(echiquer)

        // Un plateau donne un ensemble de méthodes.
        // il faut permettre au joueur d'avoir accès a certaines et le superviseur aux autres.
        // pour ce cas, il faut créer un adapteur pour chaque classe.
        // on utilise la ségrégation d'interface pour permettre à chaque classe d'avoir accès à ses méthodes.
        Plateau plateau = new Plateau();
        Joueur joueur = new Joueur(plateau);
        Superviseur superviseur = new Superviseur(plateau);

        superviseur.disposer();
        joueur.obtenir();
    }

}
