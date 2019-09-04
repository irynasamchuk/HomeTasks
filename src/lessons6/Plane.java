package lessons6;

import java.util.List;

public class Plane implements Flyable {
    private String engine;
    private List<String> wing;

    @Override
    public void fly(){
        System.out.println("I fly");
    }

}
