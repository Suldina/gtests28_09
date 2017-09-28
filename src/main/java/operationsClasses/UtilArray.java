package operationsClasses;

public class UtilArray {
	/**
	 * Get numbers in expression
	 * 
	 * @param stringAfterSplit
	 * @return
	 */
	public int[] convertToInt(String... stringAfterSplit) {
		int[] numbers = new int[stringAfterSplit.length];
		for (int i = 0; i < stringAfterSplit.length; i++) {
			numbers[i] = Integer.parseInt(stringAfterSplit[i]);
		}
		return numbers;
	}
}
