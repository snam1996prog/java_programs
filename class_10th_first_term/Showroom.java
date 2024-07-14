package class_10th_first_term;
import java.util.*;
public class Showroom {
    String name;
    long mobile;
    double cost, dis, amt;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.println("Enter the customer's name: ");
        name = sc.nextLine();
        System.out.println("Enter customer's mobile number: ");
        mobile = sc.nextLong();
        System.out.println("Enter the cost of the purchased item: ");
        cost = sc.nextDouble();
    }

    void calculate(){
        if (cost<=10000){
            dis = (5.0/100.0)*cost;
        } else if (cost>10000 && cost<=20000) {
            dis = (10.0/100.0)*cost;
        } else if (cost>20000 && cost<=35000) {
            dis = (15.0/100.0)*cost;
        }else {
            dis = (20.0/100.0)*cost;
        }
        amt = cost-dis;
    }

    void display(){
        System.out.println("Customer Name: "+name);
        System.out.println("Mobile no.: "+mobile);
        System.out.println("Amount to be paid: "+amt);
    }

    public static void main(String[] args) {
        Showroom sr = new Showroom();
        sr.input();
        sr.calculate();
        sr.display();
    }
}