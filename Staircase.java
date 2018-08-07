public class Staircase {
    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = n-1; k >= i; k--) {
                System.out.printf(" ");
            }
            for (int j = 1; j <= i; j++) {
               System.out.printf("#"); 
            }
            System.out.println();
        }
    }
}