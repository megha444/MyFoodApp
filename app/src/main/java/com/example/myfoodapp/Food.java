package com.example.myfoodapp;

public class Food {

private String name;
private String description;
private int imageID;

public static final Food [] foods = {
        new Food("Pizza","Thin crust pizza with extra cheese", R.drawable.pizza),
        new Food("Burger","Veg burger with aloo patty", R.drawable.burger),
        new Food("Sandwich", "Whole wheat sandwich", R.drawable.sandwich)
};
public Food(String name, String description, int imageID)
{
    this.name= name;
    this.description=description;
    this.imageID=imageID;
}

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public String getDescription() {
        return description;
    }

    public String toString()
    {
        return this.name;
    }
}
