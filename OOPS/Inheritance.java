package OOPS;

// Parent (Base) Class
class Vehicle {
    protected String brand = "Ford";
    
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

// Child (Derived) Class
class Car extends Vehicle {
    private String modelName = "Mustang";
    
    public void printDetails() {
        // Accessing inherited protected field 'brand'
        System.out.println(brand + " " + modelName);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        
        // Calling method inherited from the Vehicle class
        myCar.honk(); 
        
        // Calling method specific to the Car class
        myCar.printDetails();
    }
}
