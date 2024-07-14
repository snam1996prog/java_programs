package class_10th_first_term;

import java.util.*;

public class Employee {
    int pan;
    String name;
    double taxIncome, tax;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the pan no. of the customer: ");
        pan = sc.nextInt();
        sc.nextLine(); // Consume the newline character left after nextInt()
        System.out.println("Enter the name of the customer: ");
        name = sc.nextLine(); // Correctly read the name input
        System.out.println("Enter the income of which tax has to be calculated: ");
        taxIncome = sc.nextDouble();
    }

    void calc() {
        if (taxIncome <= 100000) {
            tax = 0.0;
        } else if (taxIncome >= 100001 && taxIncome < 150000) {
            tax = (10.0 / 100.0) * (taxIncome - 100000.0);
        } else if (taxIncome >= 150001 && taxIncome < 250000) {
            tax = 5000.0 + (20.0 / 100.0) * (taxIncome - 150000.0);
        } else {
            tax = 25000.0 + (30.0 / 100.0) * (taxIncome - 250000.0);
        }
    }

    void display() {
        System.out.println("Pan no.: " + pan);
        System.out.println("Name: " + name);
        System.out.println("Tax: " + tax);
    }

    public static void main(String[] args) {
        Employee em = new Employee();
        em.input();
        em.calc();
        em.display();
    }
}