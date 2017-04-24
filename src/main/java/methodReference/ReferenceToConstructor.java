package methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Ghazi Naceur on 25/04/2017.
 */
public class ReferenceToConstructor {

    public static void main(String args[]) {
        final List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Method Reference
        copyElements(list, ArrayList::new);
        // Lambda expression
        copyElements(list, () -> new ArrayList<>());
    }
    private static void copyElements(final List<Integer> list, final Supplier<Collection<Integer>> targetCollection) {
        // Method reference to a particular instance
        list.forEach(targetCollection.get()::add);
    }
}
