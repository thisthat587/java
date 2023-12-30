
// write A  program to store ten numbers in an array and print the sum of all elements .
import java.util.Scanner;

public class Asum {
    public static void main(String[] st) {
        int arr[] = new int[10];
        int total = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number" + "[" + (i + 1) + "] :");
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }
        System.out.println("Sum of all elements of the array: " + total);
    sc.close();
    }
}
