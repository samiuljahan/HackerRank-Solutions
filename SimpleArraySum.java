public class SimpleArraySum {
    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int val: ar)
            sum += val;        
        return sum;
    }
}