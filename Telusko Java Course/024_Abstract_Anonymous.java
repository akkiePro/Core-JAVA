abstract class AbstractClass {
    // private abstract void show();   // by default abstract methods are public methods
    // public abstract void show();     // no need to write public
    abstract void show();
}
class AbstractAnonymousDemo {
    public static void main(String[] args) {
        AbstractClass obj = new AbstractClass() {
            @Override
            void show() {
                System.out.println("in Anonymous show()");
            }
        };
        obj.show();
    }
}