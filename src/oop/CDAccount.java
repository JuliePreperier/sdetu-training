package oop;

public class CDAccount extends BankAccount implements IRate{
    String interestRates;
    void compount(){
        System.out.println("compounding interest");
    }
}
