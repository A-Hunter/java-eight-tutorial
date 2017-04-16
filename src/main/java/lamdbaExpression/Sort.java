package lamdbaExpression;

import consumer.person.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class Sort {

    public static void main(String[] args) {
        final Integer[] i = {1};
        List<Person> persons = Arrays.asList(
                new Person("Uchiha", "Itachi", 25, "Shinobi"),
                new Person("Uchiha", "Sishui", 27, "Shinobi"),
                new Person("Uzumaki", "Naruto", 20, "Shinobi"),
                new Person("Namikaze", "Minato", 45, "Shinobi"),
                new Person("Senju", "Hashirama", 125, "Shinobi")
        );
        Collections.sort(persons, (Person p1, Person p2) -> {
            if (p1.lastName.equals(p2.lastName)) {
                return p1.firstName.compareTo(p2.firstName);
            } else {
                return p1.lastName.compareTo(p2.lastName);
            }
        });

        persons.forEach(person -> {
            Integer id = i[0]++;
            System.out.println("Person " + id + " : " + person.lastName + " " + person.firstName);
        });
    }

}
