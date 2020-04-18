package com.HeadFirst.Chapter9;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    //与不同格式的菜单进行解耦
    ArrayList menus;


    public Waitress(ArrayList menus) {
        this.menus = menus;
    }


    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();

            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
