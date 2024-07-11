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
        System.out.println("Enter the customer's name: ");
        String name = sc.nextLine();
        System.out.println("Enter the number of days bike is taken on rent: ");
        days = sc.nextInt();
    }

    void compute() {
        if (days <= 5) {
            charge = 500 * days;
        } else if (days <= 10) {
            charge = (500 * 5) + ((days - 5) * 400);
        } else {
            charge = (500 * 5) + (400 * (days - 5)) + ((days - 10) * 200);
        }
    }

    void display() {
        System.out.println();
    }
}
