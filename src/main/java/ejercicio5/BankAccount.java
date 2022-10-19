
package ejercicio5;

/**
 *
 * @author Sofi
 */
public class BankAccount {
    
    private int numberAccount;
    private long clientDNI;
    private double accountBalance;

    public BankAccount() {
    }

    public BankAccount(int numberAccount, long clientDNI, double accountBalance) {
        this.numberAccount = numberAccount;
        this.clientDNI = clientDNI;
        this.accountBalance = accountBalance;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public long getClientDNI() {
        return clientDNI;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public void setClientDNI(long clientDNI) {
        this.clientDNI = clientDNI;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "numberAccount=" + numberAccount + ", clientDNI=" + clientDNI + ", accountBalance=" + accountBalance + '}';
    }
   
    
}
