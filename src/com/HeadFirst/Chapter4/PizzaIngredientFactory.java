package com.HeadFirst.Chapter4;


import com.HeadFirst.Chapter4.Ingredient.Dough;
import com.HeadFirst.Chapter4.Ingredient.Sauce;
import com.HeadFirst.Chapter4.Ingredient.Cheese;
import com.HeadFirst.Chapter4.Ingredient.Clams;


public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();


}
