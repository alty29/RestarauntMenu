package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Menu {
    private Date dateLastUpdated;
    private ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("appetizer", "main course", "dessert")
    );


    private ArrayList<MenuItem> items;

    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.dateLastUpdated = new Date();
    }
}
