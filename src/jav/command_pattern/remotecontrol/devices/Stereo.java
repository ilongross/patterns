package jav.command_pattern.remotecontrol.devices;

public class Stereo {

    private String placement;

    public Stereo(String place) {
        this.placement = place;
    }

    public void on() {
        System.out.println("Stereo is ON in " + placement);
    }

    public void off() {
        System.out.println("Stereo is OFF in " + placement);
    }

    public void setCD() {
        System.out.println("CD installed");
    }

    public void setVolume(int lvl) {
        System.out.println("Volume lvl = " + lvl);
    }
}
