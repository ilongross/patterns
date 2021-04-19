package jav.command_pattern.remotecontrol.devices;

public class CeilingFan {
    private static final int HIGH = 3;
    private static final int MEDIUM = 2;
    private static final int LOW = 1;
    private static final int OFF = 0;
    private String placement;
    private int speed;

    public CeilingFan(String place) {
        this.placement = place;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Ceiling Fan speed level = " + speed);
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println("Ceiling Fan speed level = " + speed);
    }
    public void low() {
        speed = LOW;
        System.out.println("Ceiling Fan speed level = " + speed);
    }
    public void off() {
        speed = OFF;
        System.out.print("Ceiling Fan is OFF in " + placement + ": ");
        System.out.println("Pressed on the button DOWN with speed " + speed);
    }
    public void on() {
        speed = OFF;
        System.out.print("Ceiling Fan is ON in " + placement + ": ");
        System.out.println("Ceiling Fan speed level = 0");
    }

    public int getSpeed() {
        return speed;
    }
}
