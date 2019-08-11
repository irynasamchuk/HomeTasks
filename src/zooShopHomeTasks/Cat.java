package zooShopHomeTasks;

public class Cat extends Animal{

    public Cat(String name, int legsCount, int price) {
        super(name, legsCount, price);
    }



    @Override
    public void voice() {
        System.out.println("I say may-may-may");
    }
}
