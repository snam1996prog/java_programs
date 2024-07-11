package class_10th_first_term;

import java.util.Scanner;

public class DecisionMaking_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String details="";
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the name of the customer: ");
            String name = sc.nextLine();
            System.out.println("Enter the ticket amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();
            double discount, net_amt;
            if (amt > 80000) {
                discount = (18.0 / 100.0) * amt;
            } else if (amt > 50001 && amt < 80000) {
                discount = (17.0 / 100.0) * amt;
            } else if (amt > 35001 && amt < 50000) {
                discount = (16.0 / 100.0) * amt;
            } else if (amt > 25001 && amt < 35000) {
                discount = (12.0 / 100.0) * amt;
            } else {
                discount = (5.0 / 100.0) * amt;
            }
            String formatted_disc = String.format("%.2f", discount);
            net_amt = amt - discount;
            String formatted_net_amt = String.format("%.2f", net_amt);
            details += (i + ".\t\t" + name + "\t\t\t" + amt + "\t\t\t" + formatted_disc + "\t\t\t" + formatted_net_amt+"\n");
            System.out.println("Sn.No.\t\tName\t\t\tTicket Charge\t\t\tDiscount\t\t\tNet Amount");
            System.out.println(details);
        }
    }
}
