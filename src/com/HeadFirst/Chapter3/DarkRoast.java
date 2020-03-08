package com.HeadFirst.Chapter3;

public class DarkRoast extends Beverage  {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
