import java.util.*;
public class Recursion {
    public static int sum(int n) {
        Scanner sc=new Scanner(System.in);
        if (n > 0) {
            return n + sum(n - 1);
        }
        else {
            return 0;
        } 
    }
    public static void main(String[] args) {
        int result =sum(10);
        System.out.println(result);
        
    }

}