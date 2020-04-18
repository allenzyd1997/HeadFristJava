package com.HeadFirst.Chapter9.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class PancakeHouseMenuIterator implements Iterator {

    ArrayList menuItem;
    int position = 0;


    public PancakeHouseMenuIterator(ArrayList menuItem) {
        this.menuItem = menuItem;
    }

    @Override
    public void remove() {

        if (position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");

        }
        menuItem.remove(position);
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    @Override
    public boolean hasNext() {

        return (position + 1 > menuItem.size())?false:true;
    }

    @Override
    public Object next() {
        position = position + 1 ;
        return menuItem.get(position - 1);
    }
}
