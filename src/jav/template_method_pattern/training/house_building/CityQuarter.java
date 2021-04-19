package jav.template_method_pattern.training.house_building;

import java.util.Arrays;
import java.util.List;

public class CityQuarter {

    private List<Building> buildings;

    public CityQuarter(Building ... building) {
        this.buildings = Arrays.asList(building);
    }

    public void showQuarter() {
        for (Building building : buildings) {
            building.build();
        }
    }

}
