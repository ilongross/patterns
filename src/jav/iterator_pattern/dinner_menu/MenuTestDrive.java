package jav.iterator_pattern.dinner_menu;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu(
                new MenuItem("Oreo Pancake", "Very Tasty!", false, 2.67 ),
                new MenuItem("Coffee Latte", "From best Barista", false, 1.55)
        );
        Menu dinnerMenu = new DinnerMenu(
                new MenuItem("Pasta", "By Italian chef", false, 2.99 ),
                new MenuItem("Truffels", "Best offer! Best price!", true, 3.69)
        );
        Menu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu, cafeMenu);
        waitress.printMenu();
    }
}
