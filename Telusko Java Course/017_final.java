//  1. final class
final class A {}
// class B extends A {}    // gives error because final class can not be inherited.

// 2. final method
class X {
    public X() {
        System.out.println("in A()");
    }
    public final void display() {
        System.out.println("I am display() :: by Akash");
    }
    public void show() {
        System.out.println("I am show()");
    }
}
class Y extends X {
    // while overriding display() compiler will give error
    /* public final void display() {
        System.out.println("I am display() :: by Shruti");
    } */
    // use case: to prevent override. example, Akash has created method and Shruti says done by her which is wrong.
}

class FinalDemo {
    public static void main(String[] args) {
        final int x = 5;
        // x = 4;  // compile ERROR: final variable can not be instantiated again.
        System.out.println(x);
    }
}