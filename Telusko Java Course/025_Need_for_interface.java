abstract class Computer {
    abstract void code();
}

class Laptop extends Computer {
    public void code() {
        System.out.println("code, compile, run");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("code, compile, run :: Faster");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

class NeedForInterfaceDemo {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer dev = new Developer();
        // dev.devApp(lap);
        dev.devApp(desk);
    }
}