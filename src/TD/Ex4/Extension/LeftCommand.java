package TD.Ex4.Extension;

import TD.Ex4.Pilotable;

public class LeftCommand implements Command {

    private Pilotable robot;

    public LeftCommand(Pilotable robot) {
        this.robot = robot;
    }
    @Override
    public void execute() {
        robot.left();
    }
}
