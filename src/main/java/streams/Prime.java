package streams;

import java.util.stream.IntStream;

/**
 * Created by Ghazi Naceur on 14/06/2017.
 */
public class Prime {

    private static boolean isPrime(Integer number) {
//        boolean divisible = false;
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                divisible = true;
//                break;
//            }
//        }
//        return divisible && number > 1;
        return number > 1 && IntStream.range(2,number)
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        Integer num = 7;
        if (isPrime(num)){
            System.out.println("prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
