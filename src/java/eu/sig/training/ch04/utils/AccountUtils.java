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

	public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }

    public Transfer validateCounterAccount(int sum) throws BusinessException {
    	if (sum % 11 == 0) {
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount);
            return result;
        } else {
            throw new BusinessException("Invalid account number!");
        }
    }
}