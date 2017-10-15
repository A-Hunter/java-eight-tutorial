package doubleBinaryOperator;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

public class ParallelPrefixDemoWithPrimitiveData {

    public static void main(String[] args) {
        int[] intNum1 = {3,4,2,5,1,6,3};
        IntBinaryOperator intOpt = (i1, i2) -> i1 * i2;
        System.out.println("parallel prefix for complete array");
        Arrays.parallelPrefix(intNum1, intOpt);
        IntConsumer intCon = i -> System.out.print(i+" ");
        Arrays.stream(intNum1).forEach(intCon);

        System.out.println("\nparallel prefix for array from index 1 to 4");
        int[] intNum2 = {3,4,2,5,1,6,3};
        Arrays.parallelPrefix(intNum2, 1, 4, intOpt);
        Arrays.stream(intNum2).forEach(intCon);

        double[] dbNum1 = {3.2,4.1,2.2,5.4,1.2,6.4,3.2};
        DoubleBinaryOperator dbOpt = (d1, d2) -> d1 + d2;
        System.out.println("parallel prefix for complete array");
        Arrays.parallelPrefix(dbNum1, dbOpt);
        DoubleConsumer dbCon = d -> System.out.print(d+" ");
        Arrays.stream(dbNum1).forEach(dbCon);

        System.out.println("\nparallel prefix for array from index 1 to 4");
        double[] dbNum2 = {3.2,4.1,2.2,5.4,1.2,6.4,3.2};
        Arrays.parallelPrefix(dbNum2, 1, 4, dbOpt);
        Arrays.stream(dbNum2).forEach(dbCon);
    }
}
