package methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Ghazi Naceur on 24/04/2017.
 */
public class ReferenceToInstance {

    public static void main(String args[]) {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final Comparator comparator = new Comparator();
        // Method reference
        Collections.sort(list, comparator::compare);
        // Lambda expression
        Collections.sort(list, (a,b) -> comparator.compare(a,b));
    }
    private static class Comparator {
        private int compare(final Integer a, final Integer b) {
            System.out.println(a.compareTo(b));
            return a.compareTo(b);
        }
    }
}
