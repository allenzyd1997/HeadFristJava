package com.HeadFirst.Chapter9.Component;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu ", "Breakfast");
        MenuComponent dinerMenu = new Menu("Diner Menu ", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe Menu ", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert Menu ", "dessert");

        MenuComponent allMenus = new Menu("All Menus", "All Menus Combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("A COMBLED DINNER", "Pancakes with screambled eggs, and toast", true, 13.99));
        dinerMenu.add(new MenuItem("B COMBLED DINNER", "Pancakes with sausage,  and toast", false, 12.99));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple pie", "Pie with the apple and a flakey curst, topped with vanilla ice cream", true, 3.99));


        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
