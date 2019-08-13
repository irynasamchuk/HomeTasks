package zooShopHomeTasks;

import java.util.List;

public class ZooShop {
    public String shopName;
    public List<Animal> animals;


//    public ZooShop(String shopName) {
//        this.shopName = shopName;
//    }
//
//    public ZooShop(List<Animal> animals) {
//        this.animals = animals;
//    }

    public ZooShop(String shopName, List<Animal> animals) {
        this.shopName = shopName;
        this.animals = animals;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public void getAnimalsNames() {
        System.out.println("\nВсі тваринки, що живуть у нас: ");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public void getFourLegsAnimals() {
        System.out.println("\nТварини, що мають 4 ноги:");
        for (Animal animal : animals) {
            if (animal.getLegsCount() == 4) {
                System.out.println(animal.getName());
            }
        }
    }

    public void getCheapAnimals() {
        System.out.println("\nТварини, які коштують менше 100$:");
        for (Animal animal : animals) {
            if (animal.getPrice() < 100) {
                System.out.println(animal.getName() + " " + animal.getPrice());
            }
        }
    }

    public void getExpensiveAnimals() {
        System.out.println("\nТварини, які коштують більше 100$:");
        for (Animal animal : animals) {
            if (animal.getPrice() > 100) {
//                System.out.println(animal.getName() + " " + animal.getPrice());
                System.out.println(String.format("%s %s", animal.getName(), animal.getPrice()));
            }
        }
    }


}
