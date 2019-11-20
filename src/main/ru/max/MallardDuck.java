package main.ru.max;

/**
 * @author Serov Maxim
 */
public class MallardDuck extends Duck {
    MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
