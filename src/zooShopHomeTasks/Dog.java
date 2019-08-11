package zooShopHomeTasks;

public class Dog extends Animal {
    public Dog(String name, int legsCount, int price) {
        super(name, legsCount, price);
    }

    @Override
    public void voice() {
        System.out.println("I say gav gav!");
    }
}
