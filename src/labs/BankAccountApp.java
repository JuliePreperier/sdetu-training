package labs;

import java.util.Random;

public class BankAccountApp {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("456789123",1000);
        BankAccount acc2 = new BankAccount("651742416",2000);
        BankAccount acc3 = new BankAccount("754616872",2500);

        acc1.setName("John Doe");
        System.out.println(acc1.getName());

        acc1.deposit(500);
        acc1.deposit(600);
        acc1.payBill(1000);
        acc1.accrue();
        System.out.println(acc1.toString());
    }

}

class BankAccount implements IInterest{
    // Properties
    private static int id = 1000;
    private String accountNumber; // ID + random 2 digit + first 2 of ssn
    private static final String routingNumber = "005400657";
    private String name;
    private String ssn;
    private double balance;

    // Constructor
    public BankAccount(String ssn, double initDeposit){
        System.out.println("New account created");
        balance = initDeposit;
        this.ssn = ssn;
        id++;
        setAccountNumber();
    }

    private void setAccountNumber(){
        int random = (int) (Math.random()*100);
        accountNumber = id +""+random+ssn.substring(0,2);
        System.out.println(accountNumber);
    }

    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }

    public void payBill(double amount){
        balance = balance-amount;
        System.out.println("paying bill: $"+amount);
        showBalance();
    }
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Making deposit: $"+amount);

        showBalance();
    }

    public void showBalance(){
        System.out.println("Balance: $"+balance);
    }

    @Override
    public void accrue() {
        balance = balance* (1+rate/100);
        showBalance();
    }
    @Override
    public String toString(){
        return "[Name: "+name+"}\n[Account number: "+accountNumber+"]\n"+"[Routing number: "+routingNumber+"]\n"+"[balance: $"+balance+"]";
    }
}