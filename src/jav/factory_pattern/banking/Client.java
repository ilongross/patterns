package jav.factory_pattern.banking;

import java.util.Random;

public abstract class Client {
    private final Random rand = new Random();
    private static long id;
    private static long counter = 0;
    private String sex;
    private final int age;
    private double balance;

    public Client() {
        id = ++counter;
        age = rand.nextInt(26) + 25;
        balance = rand.nextInt(10000);
    }

    public void accountOpeningRequest() {
        System.out.print("Opening account ID " + getId() + ": ");
        if(balance > 4000) {
            System.out.println("Approved.");
        }
        else {
            id = --counter;
            System.out.println("Rejected.");
        }
    }

    public void paperworking() {
        if(balance > 4000) {
            System.out.println("Photo for personal card.");
            System.out.print("Creating account... ");
            System.out.print(this);
            System.out.printf("Your Credit Limit = $%.2f\n", getBalance() * 0.3);
            System.out.println("Nice to cooperate ;) Have a nice day!!!!");
        }
    }

    public String getSex() {
        int s = rand.nextInt(2);
        switch (s) {
            case 0: sex = "women"; break;
            case 1: sex = "man"; break;
        }
        return sex;
    }

    public long getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "ID " + getId() + " (" + getSex() + ")" +
                " [age=" + getAge() + "; " +
                "BALANCE = $" + getBalance() + "]\n";
    }
}
