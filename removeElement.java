import java.util.Arrays;

public class removeElement {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 7, 8, 9 };
        String array = Arrays.toString(arr);
        System.out.println(array);
        int index = 2;
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        array = Arrays.toString(arr);
        System.out.println(array);
    }
}
