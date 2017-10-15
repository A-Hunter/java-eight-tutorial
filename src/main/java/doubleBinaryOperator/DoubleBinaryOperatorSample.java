package doubleBinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorSample {

    public static void main(String[] args) {
        DoubleBinaryOperator operator1 = (a, b) -> (a + b);
        DoubleBinaryOperator operator2 = (a, b) -> (a - b);
        DoubleBinaryOperator operator3 = (a, b) -> (a * b);
        DoubleBinaryOperator operator4 = (a, b) -> (a / b);

        System.out.println(operator1.applyAsDouble(12, 4));
        System.out.println(operator2.applyAsDouble(12, 4));
        System.out.println(operator3.applyAsDouble(12, 4));
        System.out.println(operator4.applyAsDouble(12, 4));
    }
}
