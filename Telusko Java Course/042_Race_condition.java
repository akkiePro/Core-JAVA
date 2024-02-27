// create an counter mechanism. create 2 threads and increment it to 10000 each. output should be 20000. but it won't. #RaceCondition
class Count {
    int count;
    public void increment() {
        ++count;
    }
}

class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Count obj = new Count();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                obj.increment();
            }
        });
        Thread t2 = new Thread(() ->  {
            for (int i = 0; i < 10000; i++) {
                obj.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.count);
    }
}