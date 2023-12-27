class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        A a = new A();
        B b = new B();
        Thread ta = new Thread(a);
        Thread tb = new Thread(b);
        ta.start();
        tb.start();
        
    }
}