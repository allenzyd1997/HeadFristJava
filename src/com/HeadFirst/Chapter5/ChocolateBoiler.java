package com.HeadFirst.Chapter5;

public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled ;

//    利用一个静态变量保存这个唯一的实例。
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;

    }

    public static ChocolateBoiler getInstance(){
        // 利用一个公共类完成实例化及调用
        // 需要判断的是：
        //    如果uniqueInstance == null 则创建一个实例并返回 否则 直接返回实例
        // 这样，实例化 构造方法都被类保护起来，此函数能保证只有一个实例会被创建

        if (uniqueInstance == null){
            //但是多线程的时候 这个判断会出现问题，导致uniqueInstance 被重复添加
            uniqueInstance = new ChocolateBoiler();
        }

        return uniqueInstance;

    }


    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
            //在锅炉中填充巧克力和牛奶的混合物质
        }
    }

    public boolean isEmpty() {
        return empty;
    }

}
