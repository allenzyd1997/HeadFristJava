package com.HeadFirst.Chapter1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Duck md = new MallardDuck();
        md.display();
        md.performFly();
        md.performQuack();


        System.out.println("------------------------------------------------------------");
        System.out.println("------------------------------------------------------------");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); //动态的在运行时改变方法。
        model.performFly();

    }
}
