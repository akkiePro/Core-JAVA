// 1. static intro
/* class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void display() {
        // System.out.println(brand + " : " + price + " : " + name);   // only static variables allowed to use in static method. that's why name is not giving trouble but brand and price gives error
        System.out.println("Model type = " + name);
    }
}
class StaticMethod {
    public static void main(String[] args) {
        Mobile.name = "Smart Phones";
        Mobile.display();
    }
} */

// 2. how to use non static members in static method
class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void display(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}
class StaticMethod {
    public static void main(String[] args) {
        Mobile.name = "Smart Phones";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 2000;

        Mobile.display(obj1);
        Mobile.display(obj2);
    }
}
