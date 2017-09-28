package operationsClasses;

public class Subtraction extends Operation {

	public Subtraction(String operationName) {
		super(operationName);
	}

	@Override
	public boolean getName(String operationName) {
		return operationName.equals("subtract");
	}

	public int substract(int firstDigit, int secondDigit) {
		int resultOfSubtract = firstDigit - secondDigit;
		return resultOfSubtract;
	}
}
