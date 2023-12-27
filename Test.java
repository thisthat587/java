class A implements Runnable {
    private Object lock;
    public A(Object lock){
        this.lock=lock;
    }
    public void run() {
        synchronized(lock){
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }
}

class B implements Runnable {
    private Object lock;
    public B(Object lock){
        this.lock=lock;
    }
    
    public void run() {
            synchronized(lock){
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        // long startTime = System.currentTimeMillis();
        A a = new A(lock);
        B b = new B(lock);
        Thread ta = new Thread(a);
        Thread tb = new Thread(b);
        ta.start();
        tb.start();
    }
}