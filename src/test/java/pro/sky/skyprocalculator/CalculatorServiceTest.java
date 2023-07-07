package pro.sky.skyprocalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorServiceTest {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    public void plusPositiveTest() {
        int actual = calculatorService.plus(5,5);
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void plusNegativeTest() {
        int actual = calculatorService.plus(-5,-5);
        int expected = -10;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minusPositiveTest() {
        int actual = calculatorService.minus(5,5);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void minusNegativeTest() {
        int actual = calculatorService.minus(-5,-5);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void multiplyWithOneNegativeTest() {

        int actual = calculatorService.multiply(5,-5);
        int expected = -25;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void multiplyWithNegaiveTest() {

        int actual = calculatorService.multiply(-5,-5);
        int expected = 25;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void divide() {
        int actual = calculatorService.divide(5,5);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void ReturnsDivideException() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(5,0));
    }

}
