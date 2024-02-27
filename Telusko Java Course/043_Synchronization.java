// make shared resources as synchronized. #RaceCondition
class Count {
    int count;
    public synchronized void increment() {
        ++count;
    }
}

class RaceConditionSolution {
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