package scheduler;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchedulerService {

    private static ScheduledFuture task;

    private static final ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

    static void start() {
        task = service.scheduleAtFixedRate(() -> {
            System.out.println("Deleted !");
        }, 0, 11l, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        start();
    }

}
