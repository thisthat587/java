import java.util.Scanner;
public class TimeToReachSun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double distanceToSun = 149600000000.0;
        double speed,timeToReach;
        System.out.print("Enter the speed (metres per second) : ");
        speed=sc.nextDouble();
        timeToReach=distanceToSun/speed;
        System.out.println("It takes "+String.valueOf(timeToReach)+" seconds to reach to the sun at the speed of "+String.valueOf(speed));
    }
}