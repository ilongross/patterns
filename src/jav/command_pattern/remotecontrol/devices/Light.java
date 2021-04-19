package jav.command_pattern.remotecontrol.devices;

public class Light {

    private String placement;

    public Light(String place) {
        this.placement = place;
    }

    public void on() {
        System.out.println("Light is ON in " + placement);
    }
    public void off() {
        System.out.println("Light is OFF in " + placement);
    }
}
