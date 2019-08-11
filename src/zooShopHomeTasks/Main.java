package zooShopHomeTasks;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Мурчик",4, 200));
        animals.add(new Dog("Ранго", 4, 250));
        animals.add(new Parrot("Вільям", 2, 50));
        animals.add(new Dog("Арчі", 4, 2000));
        animals.add(new Cat("Мишко", 4, 500));
        animals.add(new Parrot("Луїза", 2, 30));
        animals.add(new Dog("Барсік", 4, 600));
        animals.add(new Cat("Рижик", 4, 76));
        animals.add(new Dog("Алтай", 4, 200));
        animals.add(new Dog("Блек", 4, 100));

        for(Animal animal : animals){
            System.out.print(animal.getName() + ": ");
            animal.voice();
        }
        System.out.println(" ");

        ZooShop myZooShop = new ZooShop("Happy House");
        myZooShop.setShopName("Happy House");
        myZooShop.setAnimals(animals);
        myZooShop.getAnimalsNames();
        myZooShop.getFourLegsAnimals();
        myZooShop.getCheapAnimals();
        myZooShop.getExpensiveAnimals();


    }
}
