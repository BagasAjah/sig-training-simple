package eu.sig.training.ch04.utils;

public class AccountUtils {
	public int validateAccountNumber(){
	    // 1. Assuming result is 9-digit bank account number, validate 11-test:
		int sum = 0; // <1>
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }

        return sum;
	}
}