package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamService {

    private static List<String> getPersonsList() {
        List<String> personsList = new ArrayList<>();

        personsList.add("eee");
        personsList.add("fff");
        personsList.add("ccc");
        personsList.add("aaa");
        personsList.add("ddd");
        personsList.add("abc");
        personsList.add("bbb");
        return personsList;
    }

    public static void main(String[] args) {

        List<String> sortedPersons = new ArrayList<>();

        /***********    Streaming + Sorting    **********/
//        getPersonsList()
//                .stream()
//                .sorted()
//                .forEach(sortedPersons::add); //s -> sortedPersons.add(s)
//        System.out.println(getPersonsList());
//        System.out.println(sortedPersons);

        /***********    Streaming + Filtering    **********/
//        getPersonsList()
//                .stream()
//                .filter(s -> s.startsWith("a"))
//                .forEach(System.out::println); // s -> System.out.println(s)

        /***********    Streaming + Mapping + Sorting    **********/
//        getPersonsList()
//                .stream()
//                .map(String::toUpperCase)
//                .sorted(String::compareTo)//(s1, s2) -> s1.compareTo(s2)
//                .forEach(System.out::println);

        /***********    Streaming + Any Matching    **********/
//        boolean result = getPersonsList()
//                .stream()
//                .anyMatch(s -> s.startsWith("a"));
//        System.out.println(result);

        /***********    Streaming + All Matching    **********/
//        boolean result = getPersonsList()
//                .stream()
//                .allMatch(s -> s.startsWith("z"));
//        System.out.println(result);

        /***********    Streaming + None Matching    **********/
//        boolean result = getPersonsList()
//                .stream()
//                .noneMatch(s -> s.startsWith("z"));
//        System.out.println(result);

        /***********    Streaming + Filtering + Counting   **********/
//        long counter = getPersonsList()
//                .stream()
//                .filter(s -> s.startsWith("a"))
//                .count();
//        System.out.println(counter);

        /***********    Streaming + Sorting + Reducing    **********/
        Optional<String> result = getPersonsList()
                .stream()
                .sorted()
                .reduce((s1, s2) -> s1 + "#" + s2);
        result.ifPresent(System.out::println);
    }
}
