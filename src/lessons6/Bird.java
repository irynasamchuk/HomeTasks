package lessons6;

import java.util.List;

public class Bird implements Flyable, Etable {
    private List<String> wing;
    private String tail;

    @Override
    public void run() {
    }

    @Override
    public void fly() {
        System.out.println("I fly with you");
    }

    @Override
    public void sleep() {
    }

    @Override
    public void eat() {
        System.out.println("I am eating Bird");
    }
}
