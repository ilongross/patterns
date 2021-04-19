package jav.command_pattern.remotecontrol.commands;

import jav.command_pattern.remotecontrol.devices.CeilingFan;

public class CeilingFanIncreaseCommand implements Command {

    private CeilingFan ceilingFan;
    private int prevSpeed;

    public CeilingFanIncreaseCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        switch (prevSpeed) {
            case 0: ceilingFan.on();
                    ceilingFan.low();
                break;
            case 1: ceilingFan.medium();
                break;
            case 2: ceilingFan.high();
                break;
            case 3:
                System.out.println("Max speed level.");
                break;
        }
    }

    @Override
    public void undo() {
        prevSpeed = ceilingFan.getSpeed();
        switch (prevSpeed) {
            case 0: ceilingFan.off();
                break;
            case 1: ceilingFan.on();
                break;
            case 2: ceilingFan.low();
                break;
            case 3: ceilingFan.medium();
                break;
        }
    }
}