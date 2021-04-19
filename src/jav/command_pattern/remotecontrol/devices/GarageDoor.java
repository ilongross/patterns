package jav.command_pattern.remotecontrol.devices;

public class GarageDoor {

    public GarageDoor(String placement) {
    }

    public void up() {
        System.out.println("The door is RISED");
    }

    public void down() {
        System.out.println("The door is DOWN");
    }

    public void lightOn() {
        System.out.println("Light in garage is ON");
    }

    public void lightOff() {
        System.out.println("Light in garage is OFF");
    }

}
