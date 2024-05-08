package basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Factorials {
    public static void main(String[]args){
        int n = 10;
        System.out.println("sum :"+sum(n));
        System.out.println("factorial :"+factorial(n));

        int[] numbers = {1,2,3,4,5};
        System.out.println("Min: "+min(numbers));
        System.out.println("Max: "+max(numbers));
        System.out.println("Average: "+average(numbers));
    }
    // 1. Write a function that takes a value n returns the sum of numbers 1 to n
    public static int sum(int n){
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }
    //2.  Write a compute the factorial value
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }
    // 3.1 return min
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }
    // 3.2 return max
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
    // 3.3 Return average
    public static double average(int[] numbers){
        int sumResult=0;
        for (int i=0;i<numbers.length;i++){
            sumResult=sumResult+numbers[i];
        }
        double averageResult = (double)sumResult/numbers.length;
        return averageResult;
    }
}
