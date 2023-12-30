import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        int arr[] = { 12, 2, 2, 3, 4, 45, 5, 6, 66, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find : ");
        int find = sc.nextInt();
        boolean result = false;
        int count=0;
        for (int value:arr) {
            if (value == find) {
                result = true;
                count++;
            } 
        }
        if (result == true) {
            System.out.println("Given number found...");
            System.out.println("Occurence : "+count);
        } else if (result == false) {
            System.out.println("Given number not found...");
        }
        sc.close();
    }
}
