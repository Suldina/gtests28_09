package operationsClasses;

import java.util.Scanner;

public class StartCalculator {
	/**
	 * 
	 * main method that starts application
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CalculatorUI ui = new CalculatorUI();
		ui.displayCalculatorUI(scan);
		scan.close();
	}
}
