package jav.command_pattern.remotecontrol;

import jav.command_pattern.remotecontrol.commands.Command;
import jav.command_pattern.remotecontrol.commands.NoCommand;

public class RemoteControl {

    private static RemoteControl remoteControl;

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    private RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public static RemoteControl getRemoteControl() {
        if(remoteControl == null)
            remoteControl = new RemoteControl();
        return remoteControl;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " +
                    onCommands[i].getClass().getSimpleName() + "    " +
                    offCommands[i].getClass().getSimpleName() + "\n");
        }
        return stringBuff.toString();
    }
}
