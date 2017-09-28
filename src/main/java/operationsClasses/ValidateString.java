package operationsClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateString {
	public boolean isCorrectString(String expressionToCalculate){
        Pattern pattern = Pattern.compile("^[0-9]*\\s([a-z]){1,8}\\s([0-9]){1,5}");
        Matcher matcher = pattern.matcher(expressionToCalculate);
        return matcher.matches();
    }
}
