import java.util.Scanner;
public class income_tax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, age, gender ('F' for female and 'M' for male) and annual income: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        int income = sc.nextInt();
        double i_tax=0.0;
        if (age>60 || gender=='F'){
            System.out.println("Invalid category.");
        }
        else if (income<100000) {
            System.out.println("No Tax.");
        }
        else if (income>=100001 && income<250000) {
            i_tax = (income - 100000.0) * 10.0 / 100.0;
        }
        else if (income>=250001 && income<500000) {
            i_tax = 15000.0+(income - 250000.0) * 20.0 / 100.0;
        }
        else {
            i_tax=30000.0+(income - 500000)*30.0/100.0;
        }
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Annual income: "+income);
        System.out.println("Income tax: "+i_tax);
    }
}
