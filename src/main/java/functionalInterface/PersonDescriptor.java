package functionalInterface;

import consumer.person.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ghazi Ennacer on 13/04/2017.
 */
@FunctionalInterface
public interface PersonDescriptor {
    String describe(Person person);

    default String currentTime() {
        Date current = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd__HH:mm:ss");
        return f.format(current);
    }

    default String addDescription(String oldDescription, String newDescription){
        StringBuilder sb = new StringBuilder(oldDescription);
                sb.append(" : ")
                  .append(newDescription)
                  .append(".");
        return sb.toString();
    }
}
