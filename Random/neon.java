import java.util.Scanner;
public class neon{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int square = number * number;
        int digitSum = 0;
        for (int temp = square; temp > 0; temp /= 10) {
            digitSum += temp % 10;
        }
        if (digitSum == number) {
            System.out.println(number + " is a neon number.");
        }
        else {
            System.out.println(number + " is not a neon number.");
        }
    }
}
