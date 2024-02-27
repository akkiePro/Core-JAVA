interface Computer {
    // int age;    // not allowed because in interface all variables are by default public, static and final. so, instantiation is required.
    int age = 24;
    String name = "Akash";

    void code();
    default void entertain() {
        System.out.println("I will entertain that's final.");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run :: Faster");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

class Interfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        // dev.devApp(lap);
        dev.devApp(desk);
        System.out.println("age = " + Computer.age);
    }
}