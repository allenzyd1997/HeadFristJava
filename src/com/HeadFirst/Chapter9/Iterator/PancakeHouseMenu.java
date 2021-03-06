package com.HeadFirst.Chapter9.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {

    ArrayList menuItems;

    @Override
    public PancakeHouseMenuIterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }

    public PancakeHouseMenu(){
        menuItems = new ArrayList();

        addItem("K&B's Pancake Breakfast", "Pancakes with screambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with screambled eggs, sausage", false, 2.99);
        addItem("Blueberry Pancake", "Pancakes made with blueberries", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }



}
