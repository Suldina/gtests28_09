package operationsClasses;

public class Sum extends Operation {
	public Sum(String operationName) {
		super(operationName);
	}

	@Override
	public boolean getName(String operationName) {
		return operationName.equals("sum");
	}

	public int sum(int firstDigit, int secondDigit) {
		int resultOfSum = firstDigit + secondDigit;
		return resultOfSum;
	}
}
