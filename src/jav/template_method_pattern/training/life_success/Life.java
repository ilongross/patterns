package jav.template_method_pattern.training.life_success;

public class Life {
    public static void main(String[] args) {
        SuccessMan artist = new Artist();
        SuccessMan engineer = new Engineer();

        artist.wayTo();
        System.out.println();
        engineer.wayTo();
    }
}
