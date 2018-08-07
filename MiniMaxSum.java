public class MiniMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;
                else    sum += arr[j];                
            }
            if (i == 0) min = sum;
            if (sum <= min) min = sum;            
            if (sum >= max) max = sum;
        }
        System.out.printf("%d %d", min, max);
    }
}