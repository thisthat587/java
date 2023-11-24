import java.util.Scanner;
import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 67, 8, 9, 6, 54, 4 };
        String array = Arrays.toString(arr);
        System.out.println("Original Array : " + array);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Index number to insert the number: ");
        int index = sc.nextInt();
        System.out.print("Enter the value of number to insert : ");
        int num = sc.nextInt();
        int length = arr.length - 1;
        // System.out.println(length);
        for (int i = length; i != index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = num;
        array = Arrays.toString(arr);
        System.out.println("Modified Array : " + array);
    }
}
