class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "myThread");
        System.out.println("Child Thread : " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Child Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
