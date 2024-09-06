/**
 * Try
 */
public class Try {

    public static void main(String[] args) {
        // Create and start three threads
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        Thread thread3 = new MyThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " is running - iteration " + (i + 1));
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(name + " finished.");
        }
    }
}
