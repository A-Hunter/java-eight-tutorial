package consumer;

import java.util.function.LongConsumer;

public class LongConsumerSample {

    public static void main(String[] args) {
        LongConsumer consumer1 = a -> System.out.println(a * a);
        LongConsumer consumer2 = a -> System.out.println(a * 2L);

        //Using andThen()
        consumer1.andThen(consumer2).accept(10L);
        consumer1.andThen(consumer2).accept(100L);
    }
}
