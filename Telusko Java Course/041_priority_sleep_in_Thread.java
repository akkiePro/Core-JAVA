class PrioritySleepDemo {
    public static void main(String[] args) {
        Thread greet1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hi! " + i);
            }
        }, "greet1Thread");
        Thread greet2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello! " + i);
            }
        }, "greet2Thread");
        greet2.setPriority(Thread.MAX_PRIORITY);
        greet1.start();
        greet2.start();
        System.out.println(greet1.getPriority());   // by default set to Thread.NORM_PRIORITY = 5
        /* 
         * priority range from 1 to 10
         * Thread.MAX_PRIORITY = 10
         * Thread.NORM_PRIORITY = 5
         * Thread.MIN_PRIORITY = 1
         */
    }
}