package oop;

public class BankAccountApp {
    public static void main(String[]args){
        BankAccount acc1 = new BankAccount();

        acc1.setName("Roger Hue");
        acc1.accountType ="saving";
        acc1.balance = 1000;
        acc1.setSsn("123123123");
        acc1.deposit(1500);
        acc1.withdraw(500);
        acc1.setRate();
        acc1.increaseRate();

        System.out.println(acc1.toString());
    }
}
