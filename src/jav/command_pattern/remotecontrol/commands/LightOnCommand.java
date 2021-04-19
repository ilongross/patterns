package jav.command_pattern.remotecontrol.commands;

import jav.command_pattern.remotecontrol.devices.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light l) {
        light = l;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
