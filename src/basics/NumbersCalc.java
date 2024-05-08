package basics;

public class NumbersCalc {
    public static void main(String[] args){
        printName();
        int numA = 10;
        int numB = 20;
        addNumber(numA,numB);
        int result = multipleNumbers(numA,numB);
        System.out.println("result of multiplication: "+result);
    }

    static void printName(){
        System.out.println("My name is Tim");
    }

    static void addNumber(int numberA, int numberB){
        int sum = numberA+numberB;
        System.out.println("The sum of the number is: "+sum);
    }

    static int multipleNumbers(int numberA, int numberB){
        int result = numberA*numberB;
        addNumber(result, result);
        return result;
    }
}
