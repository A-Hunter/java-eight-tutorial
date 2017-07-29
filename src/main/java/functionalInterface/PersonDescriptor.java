package functionalInterface;

import entities.Person;

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
        return oldDescription + " : " +
                newDescription +
                ".";
    }
}
