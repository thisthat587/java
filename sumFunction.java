// import java.util.Scanner;

class sum {
    int aSum(int... args) {
        int sum = 0;
        for (int value : args) {
            sum = sum + value;
        }
        return sum;
    }
}

public class sumFunction {
    public static void main(String[] args) {
        sum s1 = new sum();
        int result = s1.aSum(2, 3, 4, 5, 6, 7, 8, 8, 9);
        System.out.println("Sum of all given numbers : " + result);
    }
}
