class RunnableLambda {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi! " + i);
            }
        });
        Thread t2 = new Thread(() ->  {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello! " + i);
            }
        });
        t1.start();
        t2.start();
    }
}