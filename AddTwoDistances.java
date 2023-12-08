// Java program to read and add two distances using class
import java.util.*;
class Distance{
    private int feet;
    private int inch;
    Distance(int f,int i){
        feet=f;
        inch=i;
    }

    static void doSum(Distance fd1,Distance fd2){
        int tfeet=fd1.feet+fd2.feet;
        int tinch=fd1.inch+fd2.inch;
        System.out.println(tfeet+" feet "+tinch+" inch ");
    }
}

public class AddTwoDistances {

    public static void main(String[] args) {
        int ft1,ft2,in1,in2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Distance : ");
        System.out.print("Enter feet : ");
        ft1=sc.nextInt();
        System.out.print("Enter inch : ");
        in1=sc.nextInt();
        System.out.println("Enter Second Distance : ");
        System.out.print("Enter feet : ");
        ft2=sc.nextInt();
        System.out.print("Enter inch : ");
        in2=sc.nextInt();
        Distance d1=new Distance(ft1, in1);
        Distance d2=new Distance(ft2, in2);
        Distance.doSum(d1,d2);
        sc.close();
    }
}