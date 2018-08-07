public class PlusMinus{
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positive = 0.0, negative   = 0.0, zeros = 0.0;
        double len = arr.length;
        for (int i : arr) {
            if( i > 0)  positive++;
            else if ( i < 0)    negative++;
            else  zeros++;  
        }
        System.out.printf("%6f%n", positive / len);
        System.out.printf("%6f%n", negative / len);
        System.out.printf("%6f", zeros / len);
    }
}
