package consumer;

import entities.Person;

import java.util.function.Consumer;

/**
 * Created by Ghazi Ennacer on 13/04/2017.
 */
public class ConsumerSample {

    private static Consumer<Person>  consume(){
        return person -> {
            String sb = person.lastName + "-" + person.firstName + "-" + person.age + "-" + person.occupation;
            System.out.println(sb);
        };
    }

    public static void main(String[] args) {
        consume().accept(
                new Person("Sishui","Uchiha",27,"Shinobi")
        );
    }
}
