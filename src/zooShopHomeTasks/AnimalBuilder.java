package zooShopHomeTasks;

import java.util.ArrayList;
import java.util.List;

public class AnimalBuilder {

    public List<Animal> getListAnimal() {
        List<Animal> pets = new ArrayList<>();
        pets.add(new Cat("Мурчик", 4, 200));
        pets.add(new Dog("Ранго", 4, 250));
        pets.add(new Parrot("Вільям", 2, 50));
        pets.add(new Dog("Арчі", 4, 2000));
        pets.add(new Cat("Мишко", 4, 500));
        pets.add(new Parrot("Луїза", 2, 30));
        pets.add(new Dog("Барсік", 4, 600));
        pets.add(new Cat("Рижик", 4, 76));
        pets.add(new Dog("Алтай", 4, 200));
        pets.add(new Dog("Блек", 4, 100));
        return  pets;
    }
}
