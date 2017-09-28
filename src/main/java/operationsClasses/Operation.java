package operationsClasses;

public class Operation {
	private String nameOfOperation;

	public Operation(String operationName) {
		this.nameOfOperation = operationName;
	}

	public boolean getName(String operationName) {
		return this.nameOfOperation.equals(operationName);
	}
}
