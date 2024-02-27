class Greet1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi! " + i);
        }
    }
}

class Greet2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! " + i);
        }
    }
}

class ThreadIntro {
    public static void main(String[] args) {
        Greet1 greet1 = new Greet1();
        Greet2 greet2 = new Greet2();

        greet1.start();
        greet2.start();
    }
}