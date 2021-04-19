package Runnable;

public class MyRunnable implements Runnable {
    public void run() {
        // for (int i = 0; i < 5; i++) {
        // System.out.println(i + "\t" + Thread.currentThread().getName());

        // try {
        // Thread.sleep(1000);

        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        System.out.println("WS");
        System.out.println("WhiteSnow");
    }

    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        // Thread t2 = new Thread();

        // t1.setName("ping");
        // t2.setName("pong");

        t1.start();
        // t2.start();
        System.out.println("WhiteSnow ");
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("for ");
    }

}