public class CurrentThreadDemo {
    public static void main(String[] args){
        Thread t= Thread.currentThread();
        System.out.println("Name of thread : "+t);
        t.setName("myThread");
        System.out.println("After changing Name : "+t);
        try{
            for(int i=1;i<=5;i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch(Exception e){
            System.out.println("main Thread interrupted");
        }
    }
}
