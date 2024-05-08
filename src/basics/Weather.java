package basics;

public class Weather {
    public static void main(String[] args){
        // give a suggestion of what to wear based on the weather (temperature)
        int temperature = 65;
        String sunCondition = "Overcast";
        if (temperature>80){
            System.out.println("short and t-shirt");
        } else if ((temperature>60) && (sunCondition=="Sunny")) {
            System.out.println("long sleave shirt and jeans");
        } else if ((temperature>50) || (sunCondition=="ouvercast")) {
            System.out.println("warmer clothes");
        } else{
          System.out.println("cold. take a sweater");
        }
    }
}
