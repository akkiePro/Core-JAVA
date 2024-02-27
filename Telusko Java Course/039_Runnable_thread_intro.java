class Greet1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hi! " + i);
        }
    }
}

class Greet2 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello! " + i);
        }
    }
}

class RunnableIntro {
    public static void main(String[] args) {
        Runnable greet1 = new Greet1();
        Runnable greet2 = new Greet2();
        Thread t1 = new Thread(greet1);
        Thread t2 = new Thread(greet2);
        t1.start();
        t2.start();
    }
}