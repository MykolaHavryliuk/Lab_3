package comparators;

import model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseComparators {
    public List<Person> sortByYear(List<Person> persons){
        persons.sort(new PersonYearComparator());
        return persons;
    }

    public List<Person> sortByYearWithStream(List<Person> persons){
        return persons.stream().sorted(new PersonYearComparator()).collect(Collectors.toList());
    }

    public List<Person> sortByName(List<Person> persons){
        persons.sort(new PersonNameComparator());
        return persons;
    }

    public List<Person> sortByNameWithStream(List<Person> persons){
        return persons.stream().sorted(new PersonNameComparator()).collect(Collectors.toList());
    }

    public List<Person> nameContainsSymbol(List<Person> persons, String x){
        List<Person> result = new ArrayList<>();
        for (Person person: persons) {
            if(person.getName().contains(x)){
                result.add(person);
            }
        }
        return result;
    }

    public Person searchByName(List<Person> persons, String name){
        for (Person person: persons){
            if(person.getName() == name){
                return person;
            }
        }
        return null;
    }
}
