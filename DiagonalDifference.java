public class DiagonalDifference {
    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] a) {
        int dg = 0;
        int dg2 = 0;
        int len = a.length;
        for (int i = 0; i < a.length; i++) {
            dg += a[i][i];            
            dg2 += a[i][len - 1];
            len--;
        }
        int dif = dg - dg2; 
        return (dif < 0) ? (dif * -1) : dif;
    }
}