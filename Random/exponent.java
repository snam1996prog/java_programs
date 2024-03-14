import java.util.*;
public class exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x (base) and y (exponent): ");
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        int i=0, z=1;
        while(i<y){
            i++;
            z*=x;
        }
        System.out.println(x+" to the power "+y+" is: "+z);
    }
}
