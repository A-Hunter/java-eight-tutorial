package functions;

import java.util.function.*;

public class FunctionsSample {

    public static void main(String[] args) {

        /**
         * Function<T,R>
         Function produces result of
         given data type and accepts one argument as given data type.
         */
        Function<Integer,String> ob = f1 -> "Age: "+f1;
        System.out.println(ob.apply(20));

        /**
         * DoubleFunction<R>
         Accepts only double data type value and returns the result
         as given data type.
         */
        DoubleFunction<String> df = d -> String.valueOf(d*5.3);
        System.out.println(df.apply(43.7));

        /**
         * DoubleToIntFunction
         Accepts double data type value and returns integer value.
         */
        DoubleToIntFunction doif = f -> new Double(f*4.8).intValue();
        System.out.println(doif.applyAsInt(43.7));

        /**
         * DoubleToLongFunction
         Accepts double data type value and returns long data type value.
         */
        DoubleToLongFunction dolf = f -> new Double(f*4.8).longValue();
        System.out.println(dolf.applyAsLong(43.7));

        /**
         * IntFunction<R>
         Accepts only integer value and produces result of given data type.
         */
        IntFunction iff = f -> f*f;
        System.out.println(iff.apply(43));

        /**
         * IntToDoubleFunction
         Accepts integer value and produces double data type value.
         */
        IntToDoubleFunction itdf = f -> f*f;
        System.out.println(itdf.applyAsDouble(43));

        /**
         * IntToLongFunction
         Accepts integer and produces long data type value.
         */
        IntToLongFunction itlf = f -> f*f;
        System.out.println(itlf.applyAsLong(43));

        /**
         * LongFunction<R>
         Accepts only long data type value and produces result of given data type.
         */
        LongFunction<String> lf = f -> String.valueOf(f*f);
        System.out.println(lf.apply(43));

        /**
         * LongToDoubleFunction
         Accepts long data type value and produces double data type value.
         */
        LongToDoubleFunction ltdf = f -> f*f;
        System.out.println(ltdf.applyAsDouble(43));

        /**
         * LongToIntFunction
         Accepts long data type value and produces integer data type value.
         */
        LongToIntFunction ltif = f -> (int)(f*f);
        System.out.println(ltif.applyAsInt(43));

        /**
         * ToDoubleBiFunction<T,U>
         Accepts two arguments of the given data type and produces result of double data type.
         */
        ToDoubleBiFunction<Integer,Integer> tdbf = (f1,f2) -> f1+f2;
        System.out.println(tdbf.applyAsDouble(102,305));

        /**
         * ToDoubleFunction<T>
         Accepts the value of given data type and produces double value.
         */
        ToDoubleFunction<Integer> tdf = f1 -> f1*301;
        System.out.println(tdf.applyAsDouble(102));

        /**
         * ToIntBiFunction<T,U>
         Accepts two arguments of given data type and produces result of integer data type.
         */
        ToIntBiFunction<Integer,Integer> tibf = (f1,f2) -> f1+f2;
        System.out.println(tibf.applyAsInt(102,306));

        /**
         * ToIntFunction<T>
         Accepts an argument of given data type and produces integer value.
         */
        ToIntFunction<Integer> tif = f -> f*123;
        System.out.println(tif.applyAsInt(306));

        /**
         * ToLongBiFunction<T,U>
         Accepts two arguments of given data type and produces long data type value.
         */
        ToLongBiFunction<Integer,Integer> tlbf = (f1,f2) -> f1-f2;
        System.out.println(tlbf.applyAsLong(306,405));

        /**
         * ToLongFunction<T>
         Accepts an argument of given data type and produces result of long data type.
         */
        ToLongFunction<Integer> tlf = f1 -> f1+50;
        System.out.println(tlf.applyAsLong(306));
    }
}
