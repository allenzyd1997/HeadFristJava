package com.HeadFirst.Chapter1;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public Duck(){

    }

    public void setFlyBehavior( FlyBehavior fb){

        flyBehavior =  fb;
    }
    public void setQuackBehavior( QuackBehavior qb ){
        quackBehavior = qb;
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Duck Swimming ~~~~~~~~");
    }

}
