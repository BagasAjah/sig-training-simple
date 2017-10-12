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

        try {
            Transfer result = AccountUtils.validateCounterAccount(sum);
        } catch (BusinessException e){
            throw e;
        }

        if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
        {
            return result;
        } else {
            throw new BusinessException("Counter-account not registered!");
        }
    }

    AccountUtils.addInterest();
}
