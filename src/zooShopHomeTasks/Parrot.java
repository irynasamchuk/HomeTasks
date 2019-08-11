package zooShopHomeTasks;

public class Parrot extends Animal{

    public Parrot(String name, int legsCount, int price) {
        super(name, legsCount, price);
    }

    @Override
    public void voice() {
        System.out.println("I am parrot. I am smart!");
    }
}
