package com.HeadFirst.Chapter7;

public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
//        鸭子一次可以飞很远，为了适配，我们需要希望turkey可以飞五次
        for (int i = 0 ; i < 5 ; i ++){
            turkey.fly();
        }
    }
}
