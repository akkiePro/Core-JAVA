class Mobile {
    String brand;
    int price;
    static String name;
    
    // constructor is used to initialize instence variables while creating objects
    public Mobile() {
        brand = "Apple";
        price = 1700;
        System.out.println("constructor called...");
    }
    
    // static block is called only once during program execution irrespective of multiple objects creation.
    // while running program, static block always executes first even before constructor.
    static {
        name = "Phone";
        // brand = "X";     // Compile ERROR: non-static variable can't be used inside static block
        System.out.println("static block called...");
    }
}
/* class StaticBlockInfo {
    public static void main(String[] args) {
        // Note: static block is not executed when constructor is called OR object is created, it is called when class is loaded for execution...
        // if this is true we won't call constructor OR create any object.
    }
} */
// No output
/**
 * OUTPUT:
 */
// this means Mobile class not loaded. to do this do following...

class ClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {  // to avoid ClassNotFoundException threw Exception
        Class.forName("Mobile");
    }
}
