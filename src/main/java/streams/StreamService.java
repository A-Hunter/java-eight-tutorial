package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private static List<String> getPersonsList() {
        List<String> personsList = new ArrayList<>();

        personsList.add("EEE");
        personsList.add("FFF");
        personsList.add("CCC");
        personsList.add("AAA");
        personsList.add("DDD");
        personsList.add("BBB");
        return personsList;
    }

    public static void main(String[] args) {
        List<String> sortedPersons = new ArrayList<>();
        getPersonsList()
                .stream()
                .sorted()
                .forEach(sortedPersons::add);
        System.out.println(getPersonsList());
        System.out.println(sortedPersons);
    }
}
