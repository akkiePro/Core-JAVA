class Human {
    public Human() {
        System.out.println("constructor called...");
    }
    public void show() {
        System.out.println("I can walk");
    }
    public void run() {
        System.out.println("I can run");
    }
}

class AnonymousObject {
    public static void main(String[] args) {
        /* 
            // how we create object
            Human obj = new Human();

            // what we actually do?
            Human obj;
            obj = new Human();  // so new Human() is actually creating object
            obj.show(); 
            obj.run();
        */
        // instead we can do following
        new Human().show();
        //  only draw back of this is if we want to call another method using Anonymous Object it creates separate object.
        new Human().run();
    }
}
/* 
 * Advantage:
 * we can save stack storage of creating Human obj; bcz obj will store in stack.
 * and because of instance variables are stored inside heap, so, new Human() will only occupy heap space.
 */