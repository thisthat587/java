// import java.util.Scanner;

class Sum {
    int aSum(int... args) {
        int sum = 0;
        for (int value : args) {
            sum = sum + value;
        }
        return sum;
    }
}

public class SumFunction {
    public static void main(String[] args) {
        Sum s1 = new Sum();
        int result = s1.aSum(2, 3, 4, 5, 6, 7, 8, 8, 9);
        System.out.println("Sum of all given numbers : " + result);
    }
}
