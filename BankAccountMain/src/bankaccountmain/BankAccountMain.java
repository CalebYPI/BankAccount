/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccountmain;

import java.util.Scanner;

/**
 *
 * @author Ty
 */
public class BankAccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // BankAccount transaction = new BankAccount("Tyronne",987654,10000);
        BankAccount transaction = new BankAccount("Jean-Luc Picard", 100237291, 5000.00f);
        Scanner input = new Scanner(System.in);
        String holder;
        long account;
        double money;

        int choice = 0;
        do {
            System.out.println("=============== Menu ================= ");
            System.out.println("1. Deposit \n2. Withdraw \n3. Show Balance \n4. Exit \nPlease enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Please Enter Amount to Deposit");
                    money = input.nextDouble();
                    transaction.deposit(money);
                    
                    break;
                case 2:
                    System.out.println("Please Enter Amount to Withdraw");
                    money = input.nextDouble();
                    if (money > transaction.balance) 
                        System.out.println("Insufficient funds");
                    else
                        transaction.withdraw(money);
                    break;

                case 3:
                    System.out.println(transaction.showBalance());
                    break;
                default:
            }
        } while (choice != 4);
        System.exit(0);
    }

}
