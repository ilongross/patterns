package jav.command_pattern.remotecontrol;

import jav.command_pattern.remotecontrol.commands.*;
import jav.command_pattern.remotecontrol.devices.CeilingFan;
import jav.command_pattern.remotecontrol.devices.GarageDoor;
import jav.command_pattern.remotecontrol.devices.Light;
import jav.command_pattern.remotecontrol.devices.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = RemoteControl.getRemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan  = new CeilingFan("LivingRoom");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanIncreaseCommand ceilingFanOn = new CeilingFanIncreaseCommand(ceilingFan);
        CeilingFanSlowDownCommand ceilingFanOff = new CeilingFanSlowDownCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        MacroCommand macrosOn = new MacroCommand(
                garageDoorUp, livingRoomLightOn, kitchenLightOn,
                ceilingFanOn, ceilingFanOn, stereoOnWithCD);

        MacroCommand macrosOff = new MacroCommand(
                garageDoorDown, ceilingFanOff, ceilingFanOff, ceilingFanOff);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(4, macrosOn, macrosOff);

        remoteControl.onButtonWasPushed(4);
        System.out.println();
        remoteControl.undoButtonWasPushed();
    }
}
