package jav.template_method_pattern.training.house_building;

public class Project {
    public static void main(String[] args) {
        CityQuarter quarter = new CityQuarter(
                new SkyScaper(),
                new TownHouse(),
                new HighRiseHouse());

        quarter.showQuarter();

    }
}
