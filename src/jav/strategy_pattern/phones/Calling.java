package jav.strategy_pattern.phones;

import jav.strategy_pattern.phones.phones.*;

import java.util.ArrayList;

public class Calling {

    public static ArrayList<Phone> phones = new ArrayList<>();

    public static void main(String[] args) {
        phones.add(new Apple());
        phones.add(new Huawei());
        phones.add(new Pixel());
        phones.add(new Samsung());

        for (Phone phone : phones) {
            System.out.printf("%s:\n", phone.getClass().getSimpleName());
            phone.use();
            System.out.println();
        }
    }
}