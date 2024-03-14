import java.util.Scanner;
public class Time_period {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the pendulum (in metres): ");
        double length = sc.nextDouble();
        System.out.print("Enter the acceleration due to gravity (in metre per second square): ");
        double gravity = sc.nextDouble();
        double timePeriod = 2 * Math.PI * Math.sqrt(length / gravity);
        System.out.println("Time period of the pendulum is: " + timePeriod + " seconds");
    }
}