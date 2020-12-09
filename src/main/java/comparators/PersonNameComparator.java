package comparators;

import model.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person a1, Person a2) {
        return a1.getName().compareTo(a2.getName());
    }
}
