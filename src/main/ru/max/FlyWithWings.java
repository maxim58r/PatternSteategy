package main.ru.max;

/**
 * @author Serov Maxim
 */
public class FlyWithWings implements FlyBehavior  {
    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
