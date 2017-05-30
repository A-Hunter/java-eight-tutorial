package supplier;

import java.util.function.Supplier;

/**
 * Created by Ghazi Naceur on 30/05/2017.
 */
public class SupplierManager {

    public static Supplier<String> supply = ()-> "Hello !!!";

    public static void main(String[] args) {
        System.out.println(supply.get());
    }
}
