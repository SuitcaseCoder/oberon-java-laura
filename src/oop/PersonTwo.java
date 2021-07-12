package oop;

public class PersonTwo {
    // instance variables:
    public String firstName;
    public String lastName;
    
    // instance method
    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }
    
    public static void main(String[] args) {
        // create an instance of a PersonTwo
        PersonTwo rick = new PersonTwo();
        
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"
    }
}