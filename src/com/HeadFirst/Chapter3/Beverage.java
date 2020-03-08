package com.HeadFirst.Chapter3;

//原书提供的是抽象类，其实完全可以使用接口代替，并且逻辑更通顺
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}


