package TD.Ex4.Extension;

import java.util.ArrayList;
import java.util.List;

public class Pilote {

    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }

    public void play() {
        for(Command command : commands) {
            command.execute();
        }
        commands.clear(); // Clear commands after execution
    }
}
