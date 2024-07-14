package class_10th_first_term;

import java.util.*;

public class mobike {
    int bno, days, charge;
    long mobile;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer's bike number: ");
        bno = sc.nextInt();
        System.out.println("Enter the customer's mobile number: ");
        mobile = sc.nextLong();
        sc.nextLine(); // Consume the newline character left after nextLong()
        System.out.println("Enter the customer's name: ");
        name = sc.nextLine(); // Correctly read the name input
        System.out.println("Enter the number of days bike is taken on rent: ");
        days = sc.nextInt();
    }

    void compute() {
        if (days <= 5) {
            charge = 500 * days;
        } else if (days <= 10) {
            charge = (500 * 5) + ((days - 5) * 400);
        } else {
            charge = (500 * 5) + (400 * (10 - 5)) + ((days - 10) * 200);
        }
    }

    void display() {
        System.out.println("Bike No.\tMobile No.\tName\tNo. of days\tCharge");
        System.out.println(bno + "\t\t" + mobile + "\t\t" + name + "\t\t" + days + "\t\t" + charge);
    }

    public static void main(String[] args) {
        mobike bike = new mobike();
        bike.input();
        bike.compute();
        bike.display();
    }
}
