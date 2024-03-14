import java.util.*;
public class series_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X and n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int power = 1, s = 1;
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum+=s*Math.pow(x, power);
            power+=2;
            s-=s*2;
        }
       System.out.println(sum);
    }
}