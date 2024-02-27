class A {
    public A() {
        // this(5);    // for example 6.
        System.out.println("in A");
    }
    public A(int x) {
        this();     // for example 7.
        System.out.println("in A int");
    }
}
class B extends A {
    public B() {
        // super(); // no need to write by default it is there
        super(5);   // for example 4.
        System.out.println("in B");
    }
    public B(int x) {
        // super(x);   // for example 3.
        this();     // for example 5 and 7.
        System.out.println("in B int");
    }
}

class SuperAndThis {
    public static void main(String[] args) {
        // example 1.
        // B obj = new B();
        /* 
         * OUTPUT:
         * in A
         * in B
         */

        // example 2.
        // B obj = new B(5);
        /* 
         * OUTPUT:
         * in A
         * in B int
         */
        
        // example 3.
        // B obj = new B(5);
        /* 
         * OUTPUT:
         * in A int
         * in B int
         */
        
        // example 4.
        // B obj = new B();
        /* 
         * OUTPUT:
         * in A int
         * in B
         */
        
        // example 5.
        // B obj = new B(5);
        /* 
         * OUTPUT:
         * in A
         * in B
         * in B int
         */
        
        // example 6.
        // B obj = new B();
        /* 
         * OUTPUT:
         * in A int
         * in A
         * in B
         */
        
        // example 7.
        B obj = new B(5);
        /* 
         * OUTPUT:
         * in A
         * in A int
         * in B
         * in B int
         */
    }
}