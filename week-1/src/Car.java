/**
 * CLASS DEFINITION:
 * A class is a BLUEPRINT or TEMPLATE that defines the structure and behavior
 * of objects. It describes what properties (attributes) and actions (methods)
 * objects of this type will have.
 * 
 * This Car class is the BLUEPRINT that defines what a car should have:
 * - Properties: brand, model, year, color, currentSpeed
 * - Behaviors: start(), accelerate(), brake(), displayInfo()
 */
public class Car {
    // INSTANCE VARIABLES (also called attributes or fields)
    // These define the STATE that each object will have
    private String brand;
    private String model;
    private int year;
    private String color;
    private int currentSpeed;
    
    // CONSTRUCTOR: Special method used to create and initialize objects
    // This is called when we use the 'new' keyword to create an object
    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.currentSpeed = 0; // All cars start at speed 0
    }
    
    // METHODS: Define the BEHAVIOR that objects of this class can perform
    
    public void start() {
        System.out.println("The " + brand + " " + model + " is starting...");
        System.out.println("Engine running!");
    }
    
    public void accelerate(int speedIncrease) {
        currentSpeed += speedIncrease;
        System.out.println("Accelerating... Current speed: " + currentSpeed + " mph");
    }
    
    public void brake(int speedDecrease) {
        currentSpeed -= speedDecrease;
        if (currentSpeed < 0) {
            currentSpeed = 0;
        }
        System.out.println("Braking... Current speed: " + currentSpeed + " mph");
    }
    
    public void displayInfo() {
        System.out.println("\n=== Car Information ===");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Color: " + color);
        System.out.println("Current Speed: " + currentSpeed + " mph");
        System.out.println("====================\n");
    }
    
    // Getter methods to access private variables
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
