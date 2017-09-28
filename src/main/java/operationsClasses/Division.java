package operationsClasses;

public class Division extends Operation {

	public Division(String operationName) {
		super(operationName);
	}

	@Override
	public boolean getName(String operationName){
		return operationName.equals("divide");
	}
	/**
	 * Perform division
	 * @param firstDigit
	 * @param secondDigit
	 * @return
	 */
	public double divide(int firstDigit, int secondDigit){
		double resultOfDivision;
        try {         	
        	return resultOfDivision = (double)firstDigit / (double)secondDigit;
        } catch (ArithmeticException e) { 
        	throw new ArithmeticException("-----You can't divide by zero!-----");
        } 
    }
}
