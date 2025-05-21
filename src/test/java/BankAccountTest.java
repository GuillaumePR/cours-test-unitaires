import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    @DisplayName("Exception when invalid balance on account creation")
    public void invalidBalanceOnAccountCreation() {
        assertThrows(IllegalArgumentException.class, () ->
                new BankAccount("Dupont", -1));
    }

    @Test
    @DisplayName("Valid account created successfully")
    public void validAccountCreatedSuccessfully() {
        BankAccount bankAccount = new BankAccount("Dupont", 100);
        assertEquals(bankAccount.getClass(), BankAccount.class);
    }

    @Test
    @DisplayName("Successful deposit")
    public void successfulDeposit() {
        BankAccount bankAccount = new BankAccount("Dupont", 100);

        bankAccount.deposit(100);

        assertEquals(bankAccount.getBalance(), 200);
    }

    @Test
    @DisplayName("Invalid deposit value refused")
    public void invalidDepositValueRefused() {
        BankAccount bankAccount = new BankAccount("Dupont", 100);

        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-100));
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(0));
    }

    @Test
    @DisplayName("Valid withdraw value accepted and operation successful")
    public void validWithdrawValueAcceptedAndOperationSuccessful() {
        BankAccount bankAccount = new BankAccount("Dupont", 100);

        bankAccount.withdraw(100);

        assertEquals(bankAccount.getBalance(), 0);
    }

    @Test
    @DisplayName("Withdraw value superior to balance")
    public void withdrawValueSuperiorToBalance() {
        BankAccount bankAccount = new BankAccount("Dupont", 100);

        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(200));
    }

    @Test
    @DisplayName("Invalid withdraw value refused")
    public void invalidWithdrawValueRefused() {
        BankAccount bankAccount = new BankAccount("Dupont", 100);

        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-100));
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(0));
    }
}
