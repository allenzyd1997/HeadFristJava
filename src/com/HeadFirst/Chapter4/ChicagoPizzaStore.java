package com.HeadFirst.Chapter4;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChiPizzaIngredientFactory();


        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("CHICAGO CHEESE PIZZA ");

        }else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("CHICAGO CLAM PIZZA");
        }

        return pizza;
    }
}
