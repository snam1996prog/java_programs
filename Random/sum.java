import java.util.Scanner;
class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of first n natural number: ");
        int n = sc.nextInt(), odd_n=0, even_n=0;
        for (int i=1; i<=n; i++){
            if (i%2!=0){
                odd_n+=i;
            }
            else{
                even_n+=i;
            }
        }
        System.out.println("The sum of all odd number is: "+odd_n);
        System.out.println("The sum of all even numbers is: "+even_n);
    }
}
