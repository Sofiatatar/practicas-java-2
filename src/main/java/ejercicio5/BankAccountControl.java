package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Sofi
 */
public class BankAccountControl {

    public BankAccount createBankAccount() {

        Scanner read = new Scanner(System.in);
        int numberAccount;
        long clientDNI;
        double accountBalance;

        System.out.println("Ingrese el numero de cuenta bancaria:");
        numberAccount = read.nextInt();
        System.out.println("Ingrese el DNI del cliente:");
        clientDNI = read.nextLong();
        System.out.println("Ingrese el saldo inicial de la cuenta:");
        accountBalance = read.nextDouble();

        return new BankAccount(numberAccount, clientDNI, accountBalance);
    }

    public void depositMoney(BankAccount bankAccount, double deposit) {     
        bankAccount.setAccountBalance(bankAccount.getAccountBalance() + deposit);
        System.out.println("El nuevo saldo en su cuenta es: " + bankAccount.getAccountBalance());        
    }

    public void withdrawMoney(BankAccount bankAccount, double withdraw) { 
        
        if(withdraw <= bankAccount.getAccountBalance()){
        bankAccount.setAccountBalance(bankAccount.getAccountBalance() - withdraw);
        }else{
            bankAccount.setAccountBalance(0);
        }
        
       availableAccountBalance(bankAccount);
    }
    
    public void withdrawMoneyQuick(BankAccount bankAccount, double withdraw){
        
        if (withdraw<= (bankAccount.getAccountBalance()*0.2)){
            bankAccount.setAccountBalance(bankAccount.getAccountBalance() - withdraw);
            availableAccountBalance(bankAccount);
        }else {
            System.out.println("Error en la operacion: La cifra ingresada supera la disponibilidad del 20& de su saldo actual.");
        }
    }
    
    public void availableAccountBalance (BankAccount bankAccount) {
         System.out.println("El saldo en su cuenta es: " + bankAccount.getAccountBalance());
    }
    
    public void accountInformation(BankAccount bankAccount) {
        System.out.println("bankAccount.toString()");
    }
}
