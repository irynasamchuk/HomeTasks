package zooShopHomeTasks;

public class Animal {
    private String name;
    private int legsCount;
    private int price;

    public Animal(String name, int legsCount, int price) {
        this.name = name;
        this.legsCount = legsCount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public int getPrice() {
        return price;
    }

    public void voice(){
        System.out.println("Hello! I'm" + name);

    }
}
