package multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Ghazi Naceur on 30/05/2017.
 */
public class ThreadManager {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadManager threadManager = new ThreadManager();
        threadManager.createThread();
    }

    void createThread() throws ExecutionException, InterruptedException {
        CompletableFuture.runAsync(new Task()).get();
    }

    class Task implements Runnable{

        @Override
        public void run() {
            Logger.getAnonymousLogger().log(Level.INFO, "Hello World !");
        }
    }
}
