package jav.template_method_pattern.hollywood_principle;

public class Duck implements Comparable{
    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object obj) {
        Duck duck = (Duck) obj;
            if(this.getWeight() < duck.getWeight())
                return -1;
            else if(this.getWeight() == duck.getWeight())
                return 0;
            else
                return 1;
    }
}
