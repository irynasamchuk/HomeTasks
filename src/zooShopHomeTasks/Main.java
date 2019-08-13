package zooShopHomeTasks;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        AnimalBuilder petsForShop = new AnimalBuilder();
        List<Animal> animals = petsForShop.getListAnimal();

        for(Animal animal : animals){
            System.out.print(animal.getName() + ": ");
            animal.voice();
        }
        
//        ZooShop myZooShop = new ZooShop("Happy House");
//        myZooShop.setShopName("Happy House");
//        myZooShop.setAnimals(animals);
        ZooShop myZooShop = new ZooShop("Happy Zoo", animals);
        myZooShop.getAnimalsNames();
        myZooShop.getFourLegsAnimals();
        myZooShop.getCheapAnimals();
        myZooShop.getExpensiveAnimals();
    }
}
