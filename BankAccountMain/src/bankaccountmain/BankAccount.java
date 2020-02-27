/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountmain;

/**
 *
 * @author Ty
 */
public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;

    public BankAccount() {
    }

    public BankAccount(String accountHlder, long accountNmber, double balnce) {
        accountHolder = accountHlder;
        //accountHlder = accountHolder;
        //accountNmber = accountNumber;
        accountNumber = accountNmber;
        balance = balnce;
        //balnce = balance;
    }

    public void deposit(double money) {
        balance += money;
    }

    public boolean withdraw(double money) {
        if (money > balance) {
            return false;
        } else {
            balance -= money;
            return true;
        }
    }

    public String showBalance() {
        return "Good day: " + accountHolder +"\n" + "Account Number: " + accountNumber + "\n"+"Your current balance is : R" + balance;
    }

}
       /** if (money > balance) {
      **      System.out.println("Insufficient Funds Available");
       ** }
       ** else{
        **balance -= money;
        }**/
