import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.example.Main; // If using package

public class MainTest {

    private Main calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Main();
    }

    @Test
    public void testSquareRoot_ValidInput() {
        double result = calculator.squareRoot(16);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testZeroFactorial_ValidInput() {
        long result = calculator.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorial_ValidInput() {
        long result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testNaturalLogarithm_ValidInput() {
        double result = calculator.naturalLogarithm(2.71828);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testPower_ValidInput() {
        double result = calculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPower_ZeroExponent() {
        double result = calculator.power(5, 0);
        assertEquals(1.0, result, 0.0001);
    }
}
