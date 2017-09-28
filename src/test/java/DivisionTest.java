import operationsClasses.Division;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DivisionTest {
    String extectedName = "divide";
    Division division = new Division(extectedName);

    @Test
    public void testGetName() {
        Assert.assertTrue(division.getName(extectedName));
    }

    @Test
    public void testDivisionFirstDigitIsZero() {
        int firstDigit = 0;
        int secondDigit = 1;
        int expectedResult = 0;
        double actualResult = division.divide(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after division is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Test
    public void testDivisionNegativeDigits() {
        int firstDigit = -4;
        int secondDigit = -2;
        int expectedResult = 2;
        double actualResult = division.divide(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after division is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Test
    public void testDivisionPositive() {
        int firstDigit = 16;
        int secondDigit = 2;
        int expectedResult = 8;
        double actualResult = division.divide(firstDigit, secondDigit);
        Assert.assertEquals(String.format("Expected value after division is [%s] but found [%s]", expectedResult, actualResult), expectedResult, actualResult, 0.001);
    }

    @Rule
    public ExpectedException ex = ExpectedException.none();

    @Test
    public void testDivisionNegative() {
        int firstDigit = 16;
        int secondDigit = 0;
        ex.expect(ArithmeticException.class);
        ex.expectMessage("-----You can't divide by zero!-----");
        division.divide(firstDigit, secondDigit);
    }
}
