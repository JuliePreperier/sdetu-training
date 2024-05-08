package labs;

public class StudentsApp {
    public static void main(String[] args) {
        Students student1 =new Students("Joe","123456789");
        student1.setCity("Miami");
        student1.setPhone("555-45-45-65");
        student1.setState("Florida");
        student1.enroll();
        student1.pay(5000);
        student1.showCourses();
        System.out.println(student1.toString());

    }
}

class Students {
    private static int id = 1000;
    private String userId;
    private String name;
    private String email;
    private String ssn;
    private String phone;
    private String city;
    private String state;
    private double balance;

    public Students(String name, String ssn){
        this.name = name;
        this.ssn = ssn;
        setEmail();
        setUserId();
    }

    public void setUserId() {
        int random = (int) (Math.random() * 8000) + 1000;
        userId = id +""+random+ssn.substring(0,2)+ssn.substring(Math.max(0, ssn.length() - 4));
        id++;
    }

    public void setEmail() {
        email = name+"@email.com";
    }

    public void enroll(){
        System.out.println("Enrolling "+name);
    }
    public void pay(double amount){
        balance=balance-amount;
        balance = balance-amount;
        System.out.println("paying bill: $"+amount);
        checkBalance();
    }
    public void checkBalance(){
        System.out.println("Balance: $"+balance);

    }
    public void showCourses(){
        System.out.println("This is the courses of "+name+": Math, English");
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString(){
        return "[Name: "+name+"}\n[User ID: "+userId+"]\n"+"[Email: "+email+"]\n"+"[City: "+city+"]\n"+"[State: "+state+"]\n"+"[phone: "+phone+"]";
    }


}

