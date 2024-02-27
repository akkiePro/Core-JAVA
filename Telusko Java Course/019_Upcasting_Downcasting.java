class A {
    public void show1() {
        System.out.println("in A.show()");
    }
}
class B extends A {
    public void show2() {
        System.out.println("in B.show()");
    }
}
class UpcastDowncastDemo {
    public static void main(String[] args) {
        A obj1 = (A) new B();    // Upcast
        obj1.show1();
        B obj2 = (B) obj1;   // Downcast
        obj2.show2();
    }
}