import java.util.*;
public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter the number of days stayed: ");
        int n_stay = sc.nextInt();
        System.out.println("Enter your room number: ");
        int room_n = sc.nextInt();
        System.out.println("Enter check in date: ");
        int c_in = sc.nextInt();
        System.out.println("Enter check out date: ");
        int c_out = sc.nextInt();
        int bill = 0;
        if (n_stay<=3){
            bill = 1200*3;
        }
        else if (n_stay<=6) {
            bill = (1200*3)+(1000*(n_stay-3));
        }
        else if (n_stay<=9) {
            bill = (1200*3)+(1000*3)+(800*(n_stay-6));
        }
        else {
            bill = (1200*3)+(1000*3)+(800*3)+(650*(n_stay-9));
        }
        System.out.println("NAME: "+name);
        System.out.println("ROOM NUMBER: "+room_n);
        System.out.println("CHECK-IN DATE: "+c_in);
        System.out.println("CHECK-OUT DATE: "+c_out);
        System.out.println("NUMBER OF DAYS STAYED: "+n_stay);
        System.out.println("AMOUNT TO BE PAID: "+bill);

    }
}