  //Base class
    class vehicle {
    void start(){
        System.out.println("vehicle is starting");
    }
    void stop() {
        System.out.println("vehicle is stopping");
    }
    }

    //  Derived classes
class car extends vehicle {
    // Overriding method
    @Override
    void start () {
        System.out.println("car is starting with a key...");
    }
}

    class bike extends vehicle {
    // Overriding method
    @Override
    void start() {
        System.out.println("bike is starting with a self - starter...");
    }
   } 


   // main class

   public class InheritanceExample {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        car c = new car();
        bike b = new bike();

    
    //Calling Methods


    System.out.println("=== vehicle Output ===");
   v.start();
   v.stop();

   System.out.println("=== car Output ===");
   v.start();
   v.stop();

   System.out.println("=== bike Output ===");
   v.start();
   v.stop();

   //Demonstrating Examples

   System.out.println("\n=== Polymorphism Example ===");
        vehicle ref;  // Reference of base class

        ref = new car();
        ref.start(); // Calls car's overridden method

        ref = new bike();
        ref.start(); // Calls bike's overridden method
    }

   }




   