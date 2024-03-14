public class pattern {
    public static void main(String[] args) {
        int k = 1;
        for (int i=6; i>=1; i--){
            for (int j=1; j<=i; j++){
                if (i==j){
                    System.out.print(k);
                }
                else {
                    System.out.print("*");
                }
            }
            k++;
            System.out.println("");
        }
    }
}
