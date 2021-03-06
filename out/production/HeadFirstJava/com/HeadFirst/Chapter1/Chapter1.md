# 第一章介绍
### 1 找出应用中可能需要变化指出，吧他们独立出来，不要和那些不需要变化的代码混扎起一起。

因为在本代码中，鸭子作为一个具体的类具有多种属性和行为，如飞行行为，鸣叫，或是身体的各种颜色。
传统的，若是将所有的这些行为，特征写在一个父类Duck()中，会造成的结果有： 

1. 对父类的改动，
造成大量的子类需要考虑改动（eg：使父类中的飞行设置为靠翅膀飞行，那么子类中的橡皮鸭等不会飞行的鸭子就都会
继承这个方法。因此需要对所有的子类进行考虑）

2. 会造成代码的冗余（eg：鸭子有多种鸣叫方式，如"QUACK","SQUEAK","MUTE", 若是讲鸣叫方式定义
在父类中，则仅被限制到其中一种。其造成的结果是，在下面所有的子类中，非所定义类型的鸣叫方法
均要考虑进行代码的重写，从而造成冗余）

解决方法：
    1. 将会经常造成变动的属性，如飞行行为，鸣叫行为，从原有父类中分离出来，单独的用一个接口或是一个抽象类表示。
    
    2. 具体的实现这个行为的实现类，继承或是实现这个抽象类或者接口。
    
    ```
    public interface FlyBehavior {
    
        public void fly();
    }

    public class FlyWithWings implements FlyBehavior{
        @Override
        public void fly(){
            System.out.println("I'm flying with wings ");
        }
    }
    ```
    
    + 在原有的Duck()类中，使用接口类型声明两个引用变量，这样所有的子类均可
    继承它们，子类只需要在其子类中通过实现了这个接口的类型对其实例化即可。
    
    ```
       FlyBehavior flyBehavior;
         QuackBehavior quackBehavior;
    ```
    
### 2 针对接口编程，而不是针对实现编程
    曾经的，将行为写到Duck()超类中进行实现，抑或是通过其继承了特定接口的子类进行
    实现，都会过度的使依赖于实现。从而被实现的代码绑死，没办法更改行为。在本代码中
    将动作的行为交给接口，实际的实现不会绑死在原有的类上。
    
    *针对接口编程的真正含义是指针对超类型（supertype）编程*
    使用一个超类型对变量进行声明，只要实现了这个超类型的对象均可以指给这个变量。
    所以声明类的时候不需要考虑考虑执行时的真正对象类型！
    
    ```
    Dog d = new Dog(); \\针对具体的实现进行编码
    d.bark();
    ```
    
    
    
    ```
    Animal animal = new Dog(); \\利用animal进行多态调用
    animal.makeSound();
    ```
    
    以下方法的实例化甚至不需要在代码硬编码，在运行时才需知道对象
    ```
    a = getAnimal();
    a.makeSound();
    ```
    
### 3. 多用组合(composition)，少用继承
 Has A, Is A之间的区别。 本例中 Duck() Has A 飞行行为 和 鸣叫行为， 而他们的实现交由继承其的方法来进行。
 
 使用组合建立的系统具有很大的弹性，不仅可将算法族(每组行为均可看做一个算法族)封装成类，更可以在运行是动态的改变行为.
 ```
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); //动态的在运行时改变方法。
        model.performFly();

```
