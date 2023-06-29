package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorServiceParameterizedTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static int[] calculatorProvider() {
        return new int[]{6, 7,-8,9,0};
    }

    @ParameterizedTest
    @MethodSource("calculatorProvider")
    void plus(int a) {
        int actual = calculatorService.plus(a,a);
        int expected = a+a;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource ("calculatorProvider")
    void minus(int a) {
        int actual = calculatorService.minus(a,a);
        int expected = a - a;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource ("calculatorProvider")
    void multiply(int a) {
        int actual = calculatorService.multiply(a, a);
        int expected = a * a;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("calculatorProvider")
    void divide(int a) {
        int actual = calculatorService.divide(a,a);
        int expected = a / a;

        Assertions.assertEquals(expected,actual);
    }
}
