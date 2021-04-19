package MultiThreading;

public class PingPong extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + "\t" + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {

        Thread t1 = new PingPong();
        Thread t2 = new PingPong();

        t1.setName("ping");
        t2.setName("pong");

        t1.start();
        t2.start();

    }

}