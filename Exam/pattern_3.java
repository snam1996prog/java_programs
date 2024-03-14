package Exam;

public class pattern_3 {
    public static void main(String[] args) {
        int k=10;
        for(int i=4; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print(" "+k);
                k--;
            }
            System.out.println();
        }
    }
}
