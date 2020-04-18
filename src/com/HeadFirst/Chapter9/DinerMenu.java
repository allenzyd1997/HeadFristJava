package com.HeadFirst.Chapter9;

public class DinerMenu implements Menu {

    static final int MAX_ITEMS = 6 ;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    @Override
    public DinerMenuIterator createIterator(){
        return new DinerMenuIterator(menuItems);
    }


    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin')Bacon with lettuce & tomato on whole wheat", true , 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false , 2.99);
        addItem("Soup of the day", "Soup of the day with a slide of potato salad", false , 3.29);
        addItem("Hot dog", "A hot dog with saurkraut, relish ,onions, topped with cheese", false , 3.05);


    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS){
            System.out.println("MENU FULL, CANNOT ADD MORE");

        }else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1 ;
        }
    }
}
