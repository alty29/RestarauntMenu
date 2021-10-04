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

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }


    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public String toString(){
        return foodName + "\n" + description + "\n" + price;
    }

}
