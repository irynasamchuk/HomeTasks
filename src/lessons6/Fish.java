package lessons6;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.List;

public class Fish implements Flyable, Etable{
    private String tail;
    private List<String> flippers;

    @Override
    public void run() {
    }

    @Override
    public void fly() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("I an eating fish");
    }
}
