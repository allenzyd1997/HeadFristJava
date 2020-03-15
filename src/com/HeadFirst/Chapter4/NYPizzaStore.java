package com.HeadFirst.Chapter4;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {


        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();


        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NYC CHEESE PIZZA ");

        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NYC CLAM PIZZA");
        }

        return pizza;
    }
}
