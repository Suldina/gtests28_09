import operationsClasses.Subtraction;
import org.junit.Assert;
import org.junit.Test;

public class SubstrTest {
    String extectedName = "subtract";
    Subtraction subtraction= new Subtraction(extectedName);

    @Test
    public void testGetName() {
        Assert.assertTrue(subtraction.getName(extectedName));
    }

    @Test
    public void testSubtrFirstDigitIsZero() {
        int firstDigit = 0;
        int secondDigit = 9;
        int expectedResult = -9;
        double actualResult = subtraction.substract(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after subtract is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Test
    public void testSubtrNegativeDigits() {
        int firstDigit = -4;
        int secondDigit = -2;
        int expectedResult = -2;
        double actualResult = subtraction.substract(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after subtract is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }
    @Test
    public void testSubtrPositive() {
        int firstDigit = 5;
        int secondDigit = 2;
        int expectedResult = 3;
        double actualResult = subtraction.substract(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after subtract is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Test
    public void testSubtrDiffrSign() {
        int firstDigit = 5;
        int secondDigit = -2;
        int expectedResult = 7;
        double actualResult = subtraction.substract(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after subtract is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }
}
