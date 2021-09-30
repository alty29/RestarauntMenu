package restaurant;

import java.util.Date;

public class MenuItem {
    public String foodName;
    public double price;
    public String description;
    public String category;
    public boolean isNew;
    private Date dateAdded;

    public MenuItem(String foodName, double price, String description, String category) {
        this.foodName = foodName;
        this.price = price;
        this.description = description;
        this.dateAdded = new Date();
        this.category = category;
        this.isNew = true;
    }
}
