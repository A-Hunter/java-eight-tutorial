package streams;

import entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Ghazi Naceur on 30/05/2017.
 */
public class Partitioning {


    public static void main(String[] args) {
        Map<Boolean, List<Person>> groupByAge = getPersonsList().stream()
                .collect(Collectors.partitioningBy(person -> person.age <30));
        System.out.println(groupByAge);
    }

    private static List<Person> getPersonsList() {
        List<Person> personsList = new ArrayList<>();

        personsList.add(new Person("aaa","AAA", 35, "Teacher"));
        personsList.add(new Person("bbb","BBB", 22, "Student"));
        personsList.add(new Person("ccc","CCC", 36, "Teacher"));
        personsList.add(new Person("ddd","DDD", 37, "Teacher"));
        personsList.add(new Person("eee","EEE", 21, "Student"));
        personsList.add(new Person("eee","EEE", 45, "Manager"));
        return personsList;
    }
}
