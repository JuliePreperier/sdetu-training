package basics;

public class Days {
    public static void main(String[]args){
        // Execute different block of code based on the value of a condition
        String dayOfWeek = "Tuesday";
        switch (dayOfWeek){
            case "Monday" :
                System.out.println("Today is monday");
                break;
            case "Tuesday" :
                System.out.println("Today is Tuesday");
            case "wednesday" :
                System.out.println("Today is wednesday");
                break;
        }
    }
}
