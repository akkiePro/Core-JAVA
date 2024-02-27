// Note: class<-class extends, interface<-interface extends, interface<-class implements
interface Animal {
    void walk();
    void run();
}
interface Dog extends Animal {
    void bark();
    void loyal();
}
class Main {
    public static void main(String[] args) {
        Dog obj = new Dog() {
            @Override
            public void bark() {
                System.out.println("I can bark loud.");
            }           
            @Override
            public void loyal() {
                System.out.println("I am loyal.");
            }            
            @Override
            public void run() {
                System.out.println("I can run fast.");
            }            
            @Override
            public void walk() {
                System.out.println("I can walk.");
            }
        };
        obj.bark();
        obj.run();
    }
}