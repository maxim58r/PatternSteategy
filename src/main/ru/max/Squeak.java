package main.ru.max;

/**
 * @author Serov Maxim
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
