单件模式
===

### 单件模式
> 确保一个类只有一个实例，并提供一个全局访问点。
>
> 利用单件模式，确保全局仅有一个该类的实例化。

ChocolateBoiler.java 介绍了一个很好的方法实现单件模式，
但是面对多线程的任务会出现问题

```
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
```

为解决这个问题，我们用到了Singleton.java 中的办法
这里的Synchronized 保证了一个线程进入这个方法之前需要等待另一个线程结束
这个方法的调用。

```
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();

        }
        return uniqueInstance;
    }
```

如果性能上有要求，则使用双重加锁 但需要java1.5以上的支持