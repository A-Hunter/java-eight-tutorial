package doubleBinaryOperator;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class ParallelPrefixDemo {

    public static void main(String[] args) {
        BinaryOperator<Room> opt = (f1, f2) -> new Room(f1.getLength() + f2.getLength(),
                f1.getWidth() + f2.getWidth());
        try {

            Room[] rooms = Room.getFloorSizes();
            System.out.println("parallel prefix for complete array");
            Arrays.parallelPrefix(rooms, opt);
            Consumer<Room> print = f-> System.out.println(f.getLength()+", "+f.getWidth());
            Arrays.stream(rooms).forEach(print);
            System.out.println("parallel prefix for array from index 1 to 4");
            rooms = Room.getFloorSizes();
            Arrays.parallelPrefix(rooms, 1, 4, opt);
            Arrays.stream(rooms).forEach(print);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
