package optional;

import entities.Person;

import java.util.Optional;

/**
 * Created by Ghazi Ennacer on 16/04/2017.
 */
public class OptionalSample {
    public static void main(String[] args) {
        Optional<Person> optionalOfperson = Optional.of(
                new Person("Freecss", "Ging", 45, "Hunter"))
                .filter(person -> {
                    if (person.age < 50) {
                        String msg = person.lastName + " " + person.firstName + " : There is not too much information about him.";
                        System.out.println(msg);
                        return true;
                    }
                    return false;
                });
        optionalOfperson.ifPresent(s -> System.out.println(s.toString()));
        try {
            Person person = optionalOfperson.get();
            System.out.println(person.toString());
            optionalOfperson.orElse(new Person("unknown", "unknown", 20, "unknown"));
        }catch (Exception e){
            System.out.println("Cause : " + e.getCause());
        }

    }
}
