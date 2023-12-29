class MultiThread implements Runnable {
    Thread t;
    String name;

    MultiThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Child Thread : " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String args[]) {
        new MultiThread("One");
        new MultiThread("Two");
        new MultiThread("Three");

        try{
            Thread.sleep(1000);
        } catch(Exception e){

        }
    }
}
