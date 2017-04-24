package methodReference;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Ghazi Naceur on 24/04/2017.
 */
public class ReferenceToStaticMethod {

    public static void main(String args[]) {
        Collection<String> collection = new ArrayList<>();
        // Method 1 : Method reference
        collection.forEach(ReferenceToStaticMethod::print);
        // Method 2 : Lambda expression
        collection.forEach(s -> ReferenceToStaticMethod.print(s));
        // Method 3 : Normal
        for (String s : collection) {
            ReferenceToStaticMethod.print(s);
        }
    }

    private static void print(final String number) {
        System.out.println("String : " + number);
    }
}
