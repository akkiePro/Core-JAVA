class A {
    public void show() {
        System.out.println("in A.show()");
    }
}
class AnonymousClassDemo {
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();     // in A.show()
        A obj = new A() {
            public void show() {
                System.out.println("in new anonymous A.show()");
            }
        };
        obj.show();     // in new anonymous A.show()
    }
}