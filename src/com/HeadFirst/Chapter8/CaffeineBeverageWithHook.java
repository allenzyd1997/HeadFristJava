package com.HeadFirst.Chapter8;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiment()){
            addCondiment();
        }
    }

    abstract void brew();

    abstract void addCondiment();

    void boilWater(){
        System.out.println("Boiling Water");
    }
    void pourInCup(){
        System.out.println("Pouring into a cup");
    }

    boolean customerWantsCondiment(){ // 这是一个hook
        return true;
    }
}
