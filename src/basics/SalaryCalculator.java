package basics;

public class SalaryCalculator {
    public static void main(String[] args){
        // let's create a variable to define our career
        String career;
        System.out.println("Program is strating");
        career = "Software developer";
        System.out.println("My career is"+career);
        int hoursPersWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.5;
        career = "Web developer";
        double salary = hoursPersWeek*weeksPerYear*rate;
        System.out.println("My salary as a "+career+" at the rate of $"+rate+" per hour is $"+salary+" per year");
        // Computer our annual salary
        // rate * hoursPerWeek * WeeksPerYear
    }
}
