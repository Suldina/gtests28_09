import operationsClasses.Multiplication;
import org.junit.Assert;
import org.junit.Test;

public class MultyplTest {
    String extectedName = "multiply";
    Multiplication multiplication = new Multiplication(extectedName);

    @Test
    public void testGetName() {
        Assert.assertTrue(multiplication.getName(extectedName));
    }

    @Test
    public void testMultiplFirstDigitIsZero() {
        int firstDigit = 0;
        int secondDigit = 9;
        int expectedResult = 0;
        double actualResult = multiplication.multiply(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after multiply is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Test
    public void testMultiplnNegativeDigits() {
        int firstDigit = -4;
        int secondDigit = -2;
        int expectedResult = 8;
        double actualResult = multiplication.multiply(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after multiply is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }
    @Test
    public void testMultiplPositive() {
        int firstDigit = 5;
        int secondDigit = 2;
        int expectedResult = 10;
        double actualResult = multiplication.multiply(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after multiply is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }
}
