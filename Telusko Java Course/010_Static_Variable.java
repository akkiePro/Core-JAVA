// 1. without static
/* class Mobile {
    String brand;
    int price;
    String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        obj1.name = "FoldPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1500;
        obj2.name = "SmartPhone";
        
        obj1.show();
        obj2.show();
        // OUTPUT
        // Samsung : 1700 : FoldPhone
        // Apple : 1500 : SmartPhone 
    }
} */

// 2. with static keyword
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1700;
        Mobile.name = "FoldPhone";
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1500;
        Mobile.name = "SmartPhone";
        
        obj1.show();
        obj2.show();
        // OUTPUT
        // Samsung : 1700 : SmartPhone
        // Apple : 1500 : SmartPhone 

        // Note: both become SmartPhone because static is same for everywhere.
    }
}
