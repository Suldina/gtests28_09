package operationsClasses;

/**
 * Describes permit operationsClasses
 *
 */
public enum MathOperationsEnum {
	sum("+"), subtract("-"), multiply("*"), divide("/");
	private final String mathOperations;

	public String toString() {
		return mathOperations;
	}

	private MathOperationsEnum(String mathOperations) {
		this.mathOperations = mathOperations;
	}
}
