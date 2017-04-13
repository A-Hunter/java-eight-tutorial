package runnable;

import consumer.person.Person;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ghazi Ennacer on 14/04/2017.
 */
public class RunnableSample {
    public static void run(Person person) {
        Runnable runnable = () -> {
            try {
                String threadName = Thread.currentThread().getName();
                System.out.println(person.lastName);
                TimeUnit.SECONDS.sleep(1);
                System.out.println(person.firstName);
                TimeUnit.SECONDS.sleep(2);
                System.out.println(person.age);
                TimeUnit.SECONDS.sleep(3);
                System.out.println(person.occupation);
                TimeUnit.SECONDS.sleep(4);
                System.out.println(threadName + " : this was the name of the current thread.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public static void main(String[] args) {
        run(new Person("Isaac", "Netero", 125, "Hunter"));
    }
}