package day28abstraction;

public class Dog extends Mammal{
    public void eat() {
        System.out.println("Dogs eat");
    }

    @Override
    public void move() {
        System.out.println("Dogs move");
    }
}
