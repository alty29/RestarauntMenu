package restaurant;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItems = new ArrayList<>(Arrays.asList(
                new MenuItem(
                        "burger",
                        3.05,
                        "frozen.",
                        "main course"),
                new MenuItem(
                        "water ice",
                        1.50,
                        "We only have cherry and lemon, the best ones.",
                        "dessert"),
                new MenuItem(
                        "Spaghetti",
                        15.00,
                        "just like moms.",
                        "main course"),
                new MenuItem(
                        "Cheese Toast",
                        109.00,
                        "Cheese on Toast.",
                        "appetizer")));


        Menu menu = new Menu(menuItems);
        menu.addMenuItem(new MenuItem(
                "Grilled Bananas",
                2.50,
                "Bananas fried up real nice with some whipped cream.",
                "dessert"));

        menu.printMenu();


        System.out.println(menuItems.get(1));

        menuItems.remove(3);
        menu.printMenu();

    }
}
