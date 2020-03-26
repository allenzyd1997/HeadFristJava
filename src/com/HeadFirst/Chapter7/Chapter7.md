适配器模式与外观模式
===


### 适配器模式定义
> 将一个类的接口，转换成客户期望的另一个接口。适配器让本来接口不兼容的类可以合作无间。
> 
> 从而让客户从实现的接口中解耦
>


适配器有两种形式：类适配器和对象适配器，类适配器会用到多重继承。

### 外观模式定义
> 提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。
>

外观模式，不只是简化了接口，也将客户从组件的子系统中解耦。一个简单的例子，打开家庭影院的一系列操作即可使用外观模式包裹起来，简化客户操作。

```java

public class HomeTheaterFacade{
    Amplifier amp ;
    Tuner tuner;
    DvdPlayer dvd;
    Screen screen;
    
    public HomeTheaterFacade(    Amplifier amp,
                                 Tuner tuner,
                                 DvdPlayer dvd,
                                 Screen screen){
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.screen = screen;

    }
    
    public void watchMovie(){
        amp.on();
        tuner.on();
        dvd.on();
        screen.on();
    }
    // 同样的可以把更多的操作定义在这个类里；
}
```

### 最少知识原则  Law of Demeter
> 最少只是原则意味减少对象之间的交互，只和最密切对象交互
>
>这个原则使我们减少了类和类之间的耦合，减少维护成本。
>
>缺点： 造成更多的包装类被制造出来，可能增加复杂度和开发成本



如何做到：
    只调用以下范围内的方法：
        
        * 该对象本身
        * 被当作方法的参数而传递进来的对象
        * 此方法所创建或实例化的任何对象
        * 对象的任何组件
               
