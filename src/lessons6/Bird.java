package lessons6;

import java.util.List;

public class Bird implements Flyable {
    private List<String> wing;
    private String tail;

    @Override
    public void fly() {
        System.out.println("I fly with you");
    }
}
