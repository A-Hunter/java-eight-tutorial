package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalSample2 {

    static class Outer {
        Nested nested = new Nested();
        Nested getNested(){
            return nested;
        }
    }

    static class Nested {
        Inner inner = new Inner();
        Inner getInner(){
            return inner;
        }
    }

    static class Inner {
        String text = "text";
        String getText(){
            return text;
        }
    }

    public static void main(String[] args){
        test1();
        test2();
        test3();
    }

    private static Optional resolve(Supplier supplier){
        //Supplier : the type of results supplied by this supplier
        try{
            Object result = supplier.get();
            return Optional.ofNullable(result);
        }catch (NullPointerException e){
            return Optional.empty();
        }
    }

    private static void test3(){
        Outer outer = new Outer();
        resolve(() -> outer.getNested().getInner().getText())
                .ifPresent(System.out::println);
    }

    private static void test2(){
        Optional.of(new Outer())
                .map(Outer::getNested)
                .map(Nested::getInner)
                .map(Inner::getText)
                .ifPresent(System.out::println);
    }

    private static void test1(){
        Optional.of(new Outer())
                .flatMap(o -> Optional.ofNullable(o.nested))
                .flatMap(n -> Optional.ofNullable(n.inner))
                .flatMap(i -> Optional.ofNullable(i.text))
                .ifPresent(System.out::println);
    }
}
