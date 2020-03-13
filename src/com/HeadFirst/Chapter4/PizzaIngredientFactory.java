package com.HeadFirst.Chapter4;


import com.HeadFirst.Chapter4.Ingredient.Dough;
import com.HeadFirst.Chapter4.Ingredient.Sauce;
import com.HeadFirst.Chapter4.Ingredient.Cheese;
import com.HeadFirst.Chapter4.Ingredient.Clams;


public interface PizzaIngredientFactory {
    //材料工厂，构成一个抽象工厂类，并不能对原商家泪中的其他数据直接更改是其弊端

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();


}
