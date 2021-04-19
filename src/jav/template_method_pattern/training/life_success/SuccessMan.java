package jav.template_method_pattern.training.life_success;

public abstract class SuccessMan {

    public final void wayTo() {
        growUp();
        learning();
        gettingMoney();
        createFamily();
        getHappiness();
    }

    public void growUp() {
        System.out.println("Grow up while you are little baby");
    }

    public abstract void learning();

    public abstract void gettingMoney();

    public void createFamily() {
        System.out.println("This can do only TRUE LOVE");
    }

    public abstract void getHappiness();

}