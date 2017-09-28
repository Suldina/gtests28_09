import operationsClasses.Sum;
import org.junit.Assert;
import org.junit.Test;

public class SumTest {

    String extectedName = "sum";
    Sum summary= new Sum(extectedName);

    @Test
    public void testGetName() {
        Assert.assertTrue(summary.getName(extectedName));
    }

    @Test
    public void testSumFirstDigitIsZero() {
        int firstDigit = 0;
        int secondDigit = 9;
        int expectedResult = 9;
        double actualResult = summary.sum(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after sum is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Test
    public void testSumNegativeDigits() {
        int firstDigit = -4;
        int secondDigit = -2;
        int expectedResult = -6;
        double actualResult = summary.sum(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after sum is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }
    @Test
    public void testSumPositive() {
        int firstDigit = 5;
        int secondDigit = 2;
        int expectedResult = 7;
        double actualResult = summary.sum(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after sum is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Test
    public void testSumDiffrSign() {
        int firstDigit = 5;
        int secondDigit = -2;
        int expectedResult = 3;
        double actualResult = summary.sum(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after sum is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

}
