package eu.sig.training.ch04;

import eu.sig.training.ch04.utils.AccountUtils;

public class SavingsAccount {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();
    private CheckingAccount registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
        
        AccountUtils accUtils = new AccountUtils();
        int sum = accUtils.validateAccountNumber();
        
        if (sum % 11 == 0) {
            // 2. Look up counter account and make transfer object:
            CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
            Transfer result = new Transfer(this, acct, amount); // <2>
            // 3. Check whether withdrawal is to registered counter account:
            if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
            {
                return result;
            } else {
                throw new BusinessException("Counter-account not registered!");
            }
        } else {
            throw new BusinessException("Invalid account number!!");
        }
    }

    AccountUtils.addInterest();
}
