package eu.sig.training.ch04;
import eu.sig.training.ch04.utils.AccountUtils;

public class CheckingAccount {
    private static final float INTEREST_PERCENTAGE = 0.01f;
    private Money balance = new Money();
    private int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
 
        int sum = AccountUtils.validateAccountNumber();        

        try {
            Transfer result = AccountUtils.validateCounterAccount(sum);
            return result
        } catch (BusinessException e){
            throw e;
        }

    }

    AccountUtils.addInterest();
}
