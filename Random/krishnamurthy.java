import java.util.*;

public class krishnamurthy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        int num = sc.nextInt(), temp = num, fact = 1, sum = 0, digit, i = 1;
        while (temp > 0) {
            fact=1;
            digit = temp % 10;
            i=1;
            while (i <= digit) {
                i++;
                fact *= i;
                sum += fact;
            }
            temp /= 10;
        }
        System.out.println(fact);
        System.out.println(sum);
    }
}
