class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread class: " + i);
        }
    }
}

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runnable interface: " + i);
        }
    }
}

public class Practical22 {

    public static void main(String[] args) throws InterruptedException {

        // Thread using Thread class
        MyThread t1 = new MyThread();

        // Thread using Runnable interface
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        System.out.println("Both threads completed.");
    }
}
