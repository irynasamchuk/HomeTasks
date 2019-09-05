package lessons6;

public interface Flyable {
// в інтерфейсі може бути множественное наследование
    void run();

    void fly(); //в інтерфейсі методи без імплементації


    default void sleep(){ //в дефолтному методі комбінуються інші методи, він має реалізацію
        System.out.println("Sleeping");
        run();
        fly();
    }
}
