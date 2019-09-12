package personTreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Comparator<Person> personCompare = new CompareByAge().thenComparing(new CompareByName());
//        PersonTreeSet persons1 = new PersonTreeSet();
//        TreeSet<Person> persons = persons1.getPersons();

        TreeSet<Person> persons = new TreeSet<>(personCompare);
        persons.add(new Person("Ira", 33));
        persons.add(new Person("Olga", 32));
        persons.add(new Person("Max", 10));
        persons.add(new Person("Vadim", 32));
        persons.add(new Person("Misha", 27));
        persons.add(new Person("Kevin", 9));
        persons.add(new Person("Artem", 35));
        persons.add(new Person("Artem", 27));

        Iterator<Person> iterator = persons.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        CompareByAge compareByAge = new CompareByAge();
        Comparator<Person> personCompareName = new CompareByName().thenComparing(compareByAge.reversed());

        TreeSet<Person> personsComapareName = new TreeSet<>(personCompareName);
        personsComapareName.add(new Person("Ira", 33));
        personsComapareName.add(new Person("Olga", 32));
        personsComapareName.add(new Person("Max", 10));
        personsComapareName.add(new Person("Vadim", 32));
        personsComapareName.add(new Person("Misha", 27));
        personsComapareName.add(new Person("Max", 19));
        personsComapareName.add(new Person("Vadim", 32));
        personsComapareName.add(new Person("Misha", 67));

        Iterator<Person> iterator1 = personsComapareName.iterator();

        while (iterator1.hasNext()) {
            System.out.println( iterator1.next());
        }
    }
}
