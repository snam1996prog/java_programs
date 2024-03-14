import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Press 1 for area of circle, 2 for area of square and 3 for area of rectangle: ");
        int ch = sc.nextInt();
        switch (ch){
            case 1:
                System.out.println("Enter the radius of the circle (in cm): ");
                double radius = sc.nextDouble();
                double area = Math.PI*radius*radius;
                System.out.println("Area of the circle is: "+area);
                break;
            case 2:
                System.out.println("Enter the side of the square (in cm): ");
                double side = sc.nextDouble();
                double area_2 = side*side;
                System.out.println("Area of the square is: "+area_2);
                break;
            case 3:
                System.out.println("Enter the length and breadth of the rectangle (in cm): ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double area_3 = l*b;
                System.out.println("Area of the rectangle is: "+area_3);
                break;
            default:
                System.out.println("Wrong input! Try again.");

        }
    }
}