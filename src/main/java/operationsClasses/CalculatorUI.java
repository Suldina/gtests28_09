package operationsClasses;


import java.util.Scanner;

public class CalculatorUI {
	/**
	 * Perform calculations with given math operator
	 * 
	 * @param calculationExpression
	 *            - name of operation to perform
	 */
	public void getAndPerformMathOperations(String calculationExpression) {
		String[] stringAfterSplit = calculationExpression.split(" ");
		try {
			MathOperationsEnum operation = MathOperationsEnum
					.valueOf(stringAfterSplit[1]);

			UtilArray convert = new UtilArray();
			int[] digitsForCalculation = convert.convertToInt(
					stringAfterSplit[0], stringAfterSplit[2]);
			int firstDigit = digitsForCalculation[0];
			int secondDigit = digitsForCalculation[1];
			Sum sum = new Sum(operation.toString());
			Subtraction subtraction = new Subtraction(operation.toString());
			Multiplication multiplication = new Multiplication(
					operation.toString());
			Division division = new Division(operation.toString());
			switch (operation) {
			case sum:
				System.out.println("Result of summing: " + firstDigit + " + "
						+ secondDigit + " is "
						+ +sum.sum(firstDigit, secondDigit));
				break;
			case subtract:
				System.out.println("Result of subtraction: " + firstDigit
						+ " - " + secondDigit + " is "
						+ +subtraction.substract(firstDigit, secondDigit));
				break;
			case multiply:
				System.out.println("Result of multiplying: " + firstDigit
						+ " * " + secondDigit + " is "
						+ +multiplication.multiply(firstDigit, secondDigit));
				break;
			case divide:
				System.out.println("Result of division: " + firstDigit + " / "
						+ secondDigit + " is "
						+ +division.divide(firstDigit, secondDigit));
				break;
			default:
				System.out
						.println("---You mast enter the correct expression---");
			}
		} catch (Exception ex) {
			System.out
					.println("-----You have entered incorrect math operation-----");
		}
	}

	/**
	 * Get user expression and validate it
	 * 
	 * @param scan
	 */
	public void displayCalculatorUI(Scanner scan) {
		String calculationExpression = new String();
		System.out
				.println("Enter the calculation expression with one of given operationsClasses (template: 1 sum/subtract/multiply/divide 2)");
		calculationExpression = scan.nextLine();
		System.out.println();
		ValidateString stringToValidate = new ValidateString();
		if (stringToValidate.isCorrectString(calculationExpression)) {
			getAndPerformMathOperations(calculationExpression);
		} else {
			System.out
					.println("-----You have enterred incorrect expression!-----");
		}
	}
}
