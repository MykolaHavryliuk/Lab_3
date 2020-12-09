import model.Person;
import comparators.UseComparators;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UseComparators c = new UseComparators();

        Person person1 = new Person.Builder("Colia", "Havlriliuk").setGender(Person.Gender.male).setYear(2000).build();
        Person person2 = new Person.Builder("Anna", "none").setGender(Person.Gender.female).setYear(2002).build();
        Person person3 = new Person.Builder("Sasha", "none").setGender(Person.Gender.child).setYear(2010).build();


        List<Person> People = Arrays.asList(person1, person2, person3);


        System.out.println("\nSorted people by year:");
        c.sortByYear(People).forEach(a -> System.out.println("\t" + a));

        System.out.println("\nSorted people by name:");
        c.sortByName(People).forEach(a -> System.out.println("\t" + a));

        String name = "Sasha";
        System.out.println("\nSearch person by name: " + name);
        System.out.println(c.searchByName(People, name));

        String symbol = "C";
        System.out.println("\nSearch people by name that have symbol: " + symbol);
        c.nameContainsSymbol(People, symbol).forEach(a -> System.out.println("\t" + a));
    }
}
