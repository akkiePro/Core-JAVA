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
class StaticBlock {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
    }
}

/**
 * OUTPUT:
 * static block called...
 * constructor called...
 * constructor called...
 */