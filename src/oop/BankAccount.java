package oop;

public class BankAccount implements IRate{
    // Define variables
    static final String routingNumber = "0123456";
    // Instance variable
    private String name;
    private String ssn;
    String accountType;
    double balance;

    // Constructor
    BankAccount(){
        System.out.println("new account created");
    }
    // Overloading
    BankAccount(String accountType){
        System.out.println("new "+accountType+" account created");
    }
    BankAccount(String accountType, double deposit){
        System.out.println("new "+accountType+" account created");
        System.out.println("initial deposit of $"+deposit);
    }
    // Getters & Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // Define methods
    void deposit(double amount){
        balance = balance + amount;
        showActivity("DEPOSIT");
    }
    void withdraw(double amount){
        balance = balance - amount;
        showActivity("WITHDRAW");
    }
    private void showActivity(String activity){
        System.out.println("Your recent transaction: "+activity);
        System.out.println("Your new balance is: $"+balance);
    }
    void checkbalance(){
        System.out.println("Balance: $"+balance);
    }
    void getStatus(){

    }
    @Override
    public String toString(){
        return "["+name+". Type: "+accountType+". Balance: $"+balance+"}";
    }

    @Override
    public void setRate() {
        System.out.println("SETTING RATES");
    }

    @Override
    public void increaseRate() {
        System.out.println("INCREASING RATES");
    }
}
