package com.HeadFirst.Chapter9.Component;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    // 女招待只需要拿到顶层的菜单即可
    MenuComponent allMenus ;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

}

