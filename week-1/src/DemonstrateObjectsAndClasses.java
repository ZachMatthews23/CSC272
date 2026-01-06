/**
 * This program demonstrates the KEY DIFFERENCES between CLASSES and OBJECTS
 * 
 * Program: Difference-Objects-Classes
 * Purpose: To illustrate the conceptual and practical differences between
 *          classes (blueprints) and objects (instances)
 */
public class DemonstrateObjectsAndClasses {
    
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("DEMONSTRATING CLASSES vs OBJECTS");
        System.out.println("========================================\n");
        
        // KEY DIFFERENCE #1: CLASS is the BLUEPRINT, OBJECTS are INSTANCES
        System.out.println("--- DIFFERENCE #1: Blueprint vs Instance ---");
        System.out.println("CLASS: Car.java defines the BLUEPRINT");
        System.out.println("  - It exists only once in memory as a template");
        System.out.println("  - It defines structure: brand, model, year, color, speed");
        System.out.println("  - It defines behavior: start(), accelerate(), brake()");
        System.out.println("\nOBJECTS: We create MULTIPLE instances from this one blueprint\n");
        
        // Creating OBJECT #1 from the Car class
        // 'new Car(...)' creates a NEW OBJECT in memory
        // 'myCar' is a REFERENCE VARIABLE that points to this object
        Car myCar = new Car("Toyota", "Camry", 2023, "Blue");
        System.out.println("Created OBJECT #1 (myCar):");
        myCar.displayInfo();
        
        // Creating OBJECT #2 from the SAME Car class
        // This is a DIFFERENT object with DIFFERENT data
        Car yourCar = new Car("Honda", "Accord", 2022, "Red");
        System.out.println("Created OBJECT #2 (yourCar):");
        yourCar.displayInfo();
        
        // Creating OBJECT #3 from the SAME Car class
        Car friendCar = new Car("Ford", "Mustang", 2024, "Black");
        System.out.println("Created OBJECT #3 (friendCar):");
        friendCar.displayInfo();
        
        // KEY DIFFERENCE #2: CLASSES define structure, OBJECTS hold data
        System.out.println("\n--- DIFFERENCE #2: Structure vs Data ---");
        System.out.println("CLASS: Defines WHAT properties exist (brand, model, year, etc.)");
        System.out.println("OBJECTS: Each holds its OWN SPECIFIC DATA\n");
        
        System.out.println("myCar brand: " + myCar.getBrand());
        System.out.println("yourCar brand: " + yourCar.getBrand());
        System.out.println("friendCar brand: " + friendCar.getBrand());
        System.out.println("\n^ Notice: Same property (brand), different values!");
        
        // KEY DIFFERENCE #3: Each OBJECT has its own STATE
        System.out.println("\n--- DIFFERENCE #3: Independent States ---");
        System.out.println("Each OBJECT maintains its OWN state independently\n");
        
        // Operate on myCar
        System.out.println("Operating myCar:");
        myCar.start();
        myCar.accelerate(30);
        myCar.accelerate(20);
        System.out.println("myCar speed: " + myCar.getCurrentSpeed() + " mph");
        
        // Operate on yourCar (independently)
        System.out.println("\nOperating yourCar:");
        yourCar.start();
        yourCar.accelerate(50);
        System.out.println("yourCar speed: " + yourCar.getCurrentSpeed() + " mph");
        
        // friendCar hasn't been operated yet
        System.out.println("\nfriendCar hasn't been driven:");
        System.out.println("friendCar speed: " + friendCar.getCurrentSpeed() + " mph");
        
        System.out.println("\n^ Notice: Each object maintains its OWN speed value!");
        
        // KEY DIFFERENCE #4: CLASS exists once, OBJECTS can be many
        System.out.println("\n--- DIFFERENCE #4: Quantity ---");
        System.out.println("CLASS: There is only ONE Car class definition");
        System.out.println("OBJECTS: We can create UNLIMITED objects from it\n");
        
        // Create an array of Car objects to demonstrate
        Car[] carDealership = new Car[5];
        carDealership[0] = new Car("Tesla", "Model 3", 2024, "White");
        carDealership[1] = new Car("BMW", "X5", 2023, "Silver");
        carDealership[2] = new Car("Audi", "A4", 2024, "Gray");
        carDealership[3] = new Car("Mercedes", "C-Class", 2023, "Black");
        carDealership[4] = new Car("Lexus", "RX", 2024, "Blue");
        
        System.out.println("Created 5 MORE car objects from the SAME Car class:");
        for (int i = 0; i < carDealership.length; i++) {
            System.out.println("  " + (i+1) + ". " + carDealership[i].getBrand() + 
                             " " + carDealership[i].getModel());
        }
        
        // KEY DIFFERENCE #5: CLASSES are static definitions, 
        //                    OBJECTS are dynamic entities
        System.out.println("\n--- DIFFERENCE #5: Static vs Dynamic ---");
        System.out.println("CLASS: The Car class definition doesn't change at runtime");
        System.out.println("OBJECTS: Object states change dynamically during execution\n");
        
        System.out.println("Demonstrating dynamic state changes:");
        System.out.println("Initial state of myCar:");
        myCar.displayInfo();
        
        System.out.println("Performing actions on myCar:");
        myCar.accelerate(30);
        myCar.brake(10);
        
        System.out.println("Updated state of myCar:");
        myCar.displayInfo();
        
        System.out.println("^ The OBJECT's state changed, but the CLASS definition stayed the same!");
        
        // SUMMARY
        System.out.println("\n========================================");
        System.out.println("SUMMARY: Classes vs Objects");
        System.out.println("========================================");
        System.out.println("CLASS:");
        System.out.println("  • A template/blueprint for creating objects");
        System.out.println("  • Defines structure (variables) and behavior (methods)");
        System.out.println("  • Exists once in the code");
        System.out.println("  • Is abstract - cannot be used directly");
        System.out.println("\nOBJECT:");
        System.out.println("  • A concrete instance created from a class");
        System.out.println("  • Has actual data values in its variables");
        System.out.println("  • Can have many instances from one class");
        System.out.println("  • Has its own independent state and identity");
        System.out.println("  • Occupies memory space during runtime");
        System.out.println("========================================");
    }
}
