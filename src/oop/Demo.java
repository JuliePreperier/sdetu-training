package oop;

import javax.crypto.spec.PSource;
class Person{
    // kind of blueprint/template
    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name+" is walking");
    }

    void eat(){
        System.out.println(name+" is eating");
    }
    void sleep(){
        System.out.println(name+" is sleeping");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Person

        Person person1 = new Person();
        person1.name = "Joe";
        person1.email = "Joe@email.com";
        person1.phone = "555-55-55-88";

        person1.walk();
        person1.eat();
        person1.sleep();
    }
}

