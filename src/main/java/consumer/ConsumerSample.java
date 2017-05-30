package consumer;

import consumer.person.Person;

import java.util.function.Consumer;
import java.util.logging.Logger;

/**
 * Created by Ghazi Ennacer on 13/04/2017.
 */
public class ConsumerSample {

    public static Consumer<Person>  consume(){
        Consumer<Person>  consumer = person -> {
            StringBuilder sb = new StringBuilder(person.lastName)
                    .append("-")
                    .append(person.firstName)
                    .append("-")
                    .append(person.age)
                    .append("-")
                    .append(person.occupation);
            System.out.println(sb.toString());
        };
       return consumer;
    }

    public static void main(String[] args) {
        consume().accept(
                new Person("Sishui","Uchiha",27,"Shinobi")
        );
    }
}
