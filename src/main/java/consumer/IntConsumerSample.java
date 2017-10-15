package consumer;

import java.util.function.IntConsumer;

public class IntConsumerSample {

    public static void main(String[] args) {
        IntConsumer consumer1 = a -> System.out.println(a * a);
        IntConsumer consumer2 = a -> System.out.println(a * 2);

        //Using andThen()
        consumer1.andThen(consumer2).accept(10);
        consumer1.andThen(consumer2).accept(100);
    }
}
