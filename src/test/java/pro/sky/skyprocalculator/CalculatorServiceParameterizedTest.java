package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> calculatorProvider() {
        return Stream.of(Arguments.of(-2,4),
                Arguments.of(7,0));
    }


    @ParameterizedTest
    @MethodSource("calculatorProvider")
    void plus(int a, int b) {
        int actual = calculatorService.plus(a,b);
        int expected = a+b;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource ("calculatorProvider")
    void minus(int a, int b) {
        int actual = calculatorService.minus(a,b);
        int expected = a - b;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @MethodSource ("calculatorProvider")
    void multiply(int a, int b) {
        int actual = calculatorService.multiply(a, b);
        int expected = a * b;

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("calculatorProvider")
    void divide(int a, int b) {
        int actual = calculatorService.divide(a,b);
        int expected = a / b;

        Assertions.assertEquals(expected,actual);
    }
}
