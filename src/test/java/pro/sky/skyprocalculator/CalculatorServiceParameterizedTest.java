package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceParameterizedTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();


    @ParameterizedTest
    @CsvSource({
            "5,5",
            "-5,-5",
            "5,-5",
            "5,0"

    })
    void plus(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int actual = calculatorService.plus(num1, num2);
        int expected = num1 + num2;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvSource({
            "5,5",
            "-5,-5",
            "5,-5",
            "5,0"

    })
    void minus(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int actual = calculatorService.minus(num1, num2);
        int expected = num1 - num2;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvSource({
            "5,5",
            "-5,-5",
            "5,-5",
            "5,0"

    })
    void multiply(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int actual = calculatorService.multiply(num1, num2);
        int expected = num1 * num2;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvSource({
            "5,5",
            "-5,-5",
            "5,-5",
            "5,0"

    })
    void divide(String a, String b) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int actual = calculatorService.divide(num1, num2);
        int expected = num1 / num2;

        Assertions.assertEquals(expected,actual);
    }
}
