package jav.command_pattern.data_throw;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ProcessExecuter {

    private List<Command> commands = new LinkedList<>();

    public void setCommands(Command ... processes) {
        this.commands.addAll(Arrays.asList(processes));
    }

    public void executeProcesses() {
        for (Command process : this.commands) {
            process.execute();
        }
    }

}
