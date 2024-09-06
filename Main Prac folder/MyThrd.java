class Thrd implements Runnable {
    private int thread;

    public Thrd(int thread) {
        this.thread = thread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i + " Thred number is " + thread);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MyThrd {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Thrd m1 = new Thrd(i);
            Thread m2 = new Thread(m1);
            m2.start();
        }
    }
}