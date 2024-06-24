//Here is a ATM machine build by using objects and classes only.

import java.util.Scanner;

class ATMmachine{
    int PIN = 1234;
    float balance;

    public void checkPin(){
        System.out.println("\nEnter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enterPin = sc.nextInt();
        if(enterPin == PIN){
            menu();
        }
        else{
            System.out.println("Invalid Pin :(   Enter the correct pin!");
            checkPin();
        }
    }
    public void checkBalance(){
        System.out.println("Balance: "+balance);
        System.out.println("\n");
        menu();
    }
    public void deposit(){
        System.out.println("Enter the amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposited successfully");
        checkBalance();
        System.out.println("\n");
    }
    public void withdraw(){
        System.out.println("Enter amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance){
            System.out.println("Insufficient Balance!");
            checkBalance();  
        }
        else{
            balance = balance - amount;
            System.out.println("Money withdraw successfully");
            checkBalance();

        }
         System.out.println("\n");
    }  
    public void menu(){
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("Enter your Choice: ");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            checkBalance();
        }
        else if(option == 2){
            deposit();
        }
        else if(option == 3){
            withdraw();
        }
        else if(option == 4){
           return;
           
        }
        else{
            System.out.println("Invalid Choice!\n");
            menu();
        }
    }
}
public class ATM{
    public static void main(String[] bank){

        ATMmachine obj = new ATMmachine();
        obj.checkPin();


    }
}