package TD.Ex4.Extension;

import TD.Ex4.Pilotable;

public class RightCommand implements Command{

    Pilotable robot;

    public RightCommand(Pilotable robot) {
        this.robot = robot;
    }
    @Override
    public void execute() {
        robot.right();
    }
}
