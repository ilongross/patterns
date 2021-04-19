package jav.singleton_pattern;

public class ChocolateBoiler {
    private volatile static ChocolateBoiler uniqueChocoBoiler = new ChocolateBoiler();
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getUniqueChocoBoiler() {
        if(uniqueChocoBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if(uniqueChocoBoiler == null) {
                    uniqueChocoBoiler = new ChocolateBoiler();
                }
            }
        }
        return uniqueChocoBoiler;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil () {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
