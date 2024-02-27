// 1. with constructor
enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;
    private Laptop(int price) { // we are not going to create object. that's why constructors of enums are private.
        this.price = price;
    }
    private Laptop() {
        this.price = 500;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

class Main {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
/**
 * Macbook : 2000
 * XPS : 2200
 * Surface : 500
 * ThinkPad : 1800
 */