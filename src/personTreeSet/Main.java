package personTreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Person> personCompare = new CompareByAge().thenComparing(new CompareByName());
        TreeSet<Person> persons = new TreeSet<>(personCompare);
        persons.add(new Person("Ira",33));
        persons.add(new Person("Olga",32));
        persons.add(new Person("Max",10));
        persons.add(new Person("Vadim",32));
        persons.add(new Person("Misha",27));
        persons.add(new Person("Kevin",9));
        persons.add(new Person("Artem",35));
        persons.add(new Person("Artem",27));

        Iterator<Person> iterator = persons.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
