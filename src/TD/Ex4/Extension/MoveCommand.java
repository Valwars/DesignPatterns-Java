package TD.Ex4.Extension;

import TD.Ex4.Pilotable;

public class MoveCommand implements  Command{

    Pilotable robot;
    int distance;

    public MoveCommand(Pilotable robot, int distance) {
        this.robot = robot;
        this.distance = distance;
    }
    @Override
    public void execute() {
        robot.move(distance);
    }
}
