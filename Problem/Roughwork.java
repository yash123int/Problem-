
public class Roughwork {
    public static void main(String[] args){
        new RaceConditionDemo(); 
    }
}

class RaceConditionDemo {
    static int count=0;
    static final Object lock = new Object();

    Thread t1 = new Thread(() -> {
        for(int i=0;i<1000000000;i++){
            synchronized (lock) {
               count++;
            }
        }
    });

    Thread t2 = new Thread(() -> {
        for(int i=0;i<1000000000;i++){
            synchronized (lock) {
                count++;
            }
        }
    });

    public RaceConditionDemo() {
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Count: " + count);
    }
}
