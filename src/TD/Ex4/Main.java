package TD.Ex4;

import TD.Ex4.Extension.LeftCommand;
import TD.Ex4.Extension.MoveCommand;
import TD.Ex4.Extension.Pilote;
import TD.Ex4.Extension.RightCommand;

public class Main {
    public static void main(String[] args) {
        RobotT1 robot = new RobotT1();
        Pilot pilot = new Pilot();
        pilot.setMyPilotable(robot);
        pilot.play();

        // DP commands
        // on peut stacker les commands et les joueur quand on veut.
        // sans toucher à notre robot, ni à notre pilote.
        Pilote pilot2 = new Pilote();
        RobotT1 robot2 = new RobotT1();

        // Ajouter des commandes
        pilot2.addCommand(new LeftCommand(robot2));
        pilot2.addCommand(new MoveCommand(robot2, 4));
        pilot2.addCommand(new RightCommand(robot2));
        pilot2.addCommand(new MoveCommand(robot2, 9));
        pilot2.addCommand(new RightCommand(robot2));

        // Exécuter les commandes
        pilot2.play();
    }
}
