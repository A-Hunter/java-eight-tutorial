package methodReference;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ghazi Naceur on 25/04/2017.
 */
public class ReferenceToArbitraryObject {

    public static void main(String args[]) {
        final List<Shinobi> shinobis = Arrays.asList(new Shinobi("Itachi"), new Shinobi("Sishui"));
        // Method reference
        shinobis.forEach(Shinobi::printName);
        // Lambda expression
        shinobis.forEach(person -> person.printName());
        // normal
        for (final Shinobi person : shinobis) {
            person.printName();
        }
    }
    private static class Shinobi {
        private String name;
        public Shinobi(final String name) {
            this.name = name;
        }
        public void printName() {
            System.out.println(name);
        }
    }
}
