package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ghazi Naceur on 14/06/2017.
 */
public class OccurrenceSearch {
    public static void main(String[] args) {
        try {
            String searchWord = "test";
            String path = "E:\\GitHubRepositories\\java-eight-tutorial\\src\\main\\resources\\file.txt";
            long count = 0;
            ArrayList<String> words = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                words.addAll(Arrays.asList(line.split(" ")));
            }
            for (String word : words){
                if (word.equals(searchWord)) {
                    count++;
                }
            }
            System.out.println("The word " + searchWord + " occurred " + count + " time(s).");
//            long count = Files.lines(Paths.get(path))
//                 .filter(line -> line.contains(searchWord))
//                 .count();
//            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
