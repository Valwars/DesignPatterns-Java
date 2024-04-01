package TD.Ex2;

import TD.Ex2.Bridge.SuperviseurConcret;
import TD.Ex2.Interfaces.PlateauI;

public class Client {

    public static void main(String[] args) {
        // echiquer = new Plateau("Echiquer")
        // joueur = new Joueur(echiquer)
        // superviseur = new Superviseur(echiquer)

        // Un plateau donne un ensemble de méthodes.
        // il faut permettre au joueur d'avoir accès a certaines et le superviseur aux autres.
        // pour ce cas, il faut créer un adapteur pour chaque classe.
        // on utilise la ségrégation d'interface pour permettre à chaque classe d'avoir accès à ses méthodes.
        PlateauI echiquier = new Echiquier();
        Joueur joueur = new Joueur(echiquier);
        Superviseur superviseur = new Superviseur(echiquier);

        superviseur.disposer();
        joueur.obtenir();

        // old N'as pas l'interface Plateau, il faut donc passer par un adapteur.
        UnEchiquierImpl echiquierImpl = new UnEchiquierImpl();
        Adapter adapterPlateau = new Adapter(echiquierImpl);

        Joueur joueur2 = new Joueur(adapterPlateau);
        Superviseur superviseur2 = new Superviseur(adapterPlateau);

        superviseur2.disposer();
        joueur2.obtenir();


        // question 3, on veut gérer le comportement des pieces. On utilise un proxy pour ne pas  toucher a l'existant
        Echiquier echiquier3 = new Echiquier();
        EchiquerProxy echiquierProxy = new EchiquerProxy(echiquier3);

        Joueur joueur3 = new Joueur(echiquierProxy);
        Superviseur superviseur3 = new Superviseur(echiquierProxy);

        superviseur3.disposer();
        joueur3.obtenir();
        joueur3.deplacer();

        // q4 ) Bridge
        SuperviseurConcret superviseurConcret = new SuperviseurConcret(echiquierProxy);
        superviseurConcret.superviser();

    }

}
