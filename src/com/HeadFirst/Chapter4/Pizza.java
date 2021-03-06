package com.HeadFirst.Chapter4;

import com.HeadFirst.Chapter4.Ingredient.Cheese;
import com.HeadFirst.Chapter4.Ingredient.Clams;
import com.HeadFirst.Chapter4.Ingredient.Dough;
import com.HeadFirst.Chapter4.Ingredient.Sauce;

import java.util.ArrayList;

public abstract class Pizza {
    //主要的Pizza父类， 但是需要设计成抽象类 由其子类完成对他的实现
    String name;
    Dough dough;
    Sauce sauce;
    Clams clams;
    Cheese cheese;


    abstract void prepare();
    // pizza 准备的函数

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
