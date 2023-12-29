package mypackage;

// import mypackage.*;

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Piyush");
//             try {
//                 Thread.sleep(1000);
//             } catch (Exception e) {
//             }
//         }
//     }
// }

class Test {
    public static void main(String[] args) {
        A t = new A();
        Thread ta=new Thread(t);
        ta.start();
        for(int i=0;i<5;i++){
            System.out.println("Anand");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}