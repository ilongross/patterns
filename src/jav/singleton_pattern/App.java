package jav.singleton_pattern;

class App {
    public static void main(String[] args) {
//        ChocolateBoiler cb1 = ChocolateBoiler.getUniqueChocoBoiler();
//        ChocolateBoiler cb2 = ChocolateBoiler.getUniqueChocoBoiler();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

//        System.out.println(s1.getDate() + "\n" + s2.getDate());
    }
}
