package operationsClasses;

public class Multiplication extends Operation {

	public Multiplication(String operationName) {
		super(operationName);
	}

	@Override
	public boolean getName(String operationName) {
		return operationName.equals("multiply");
	}

	public int multiply(int firstDigit, int secondDigit) {
		int resultOfMultiply = firstDigit * secondDigit;
		return resultOfMultiply;
	}
}
