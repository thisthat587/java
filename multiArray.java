public class multiArray {
    public static void main(String[] args) {
        int arr[][] = { { 2, 3 }, { 3, 4, 4, 6 }, { 4, 5, 1} };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
