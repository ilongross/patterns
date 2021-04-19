package jav.command_pattern.remotecontrol.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MacroCommand implements Command{

    List<Command> commands = new ArrayList<>();

    public MacroCommand(Command ... commands) {
        this.commands.addAll(Arrays.asList(commands));
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
