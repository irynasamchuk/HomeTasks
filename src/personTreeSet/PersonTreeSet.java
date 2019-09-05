package personTreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonTreeSet {
    public static TreeSet<Person> getPersons() {
        Comparator<Person> personCompare = new CompareByAge().thenComparing(new CompareByName());
        TreeSet<Person> people = new TreeSet<>(personCompare);
        people.add(new Person("Ira", 33));
        people.add(new Person("Olga", 32));
        people.add(new Person("Max", 10));
        people.add(new Person("Vadim", 32));
        people.add(new Person("Misha", 27));
        people.add(new Person("Kevin", 9));
        people.add(new Person("Artem", 35));
        people.add(new Person("Artem", 27));
        return people;
    }
}
