package com.HeadFirst.Chapter5;

public class SingletonDouble {

    //双重检查加锁


    //被称为轻量级的 synchronized, 它比synchronized的使用和执行成本会更低
    private volatile static SingletonDouble uniqueInstance;

    private SingletonDouble(){};

    public static SingletonDouble getInstance(){
        if (uniqueInstance == null){
            synchronized (SingletonDouble.class){
                if(uniqueInstance == null){
                    uniqueInstance = new SingletonDouble();
                }
            }
        }
        return uniqueInstance;
    }
}
