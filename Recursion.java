public class Recursion {
    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calculateFactorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    // public static void printSum(int i, int n, int sum) {
    // if (i == n) {
    // sum = sum + i;
    // System.out.println(sum);
    // return;
    // }
    // sum = sum + i;
    // printSum(i + 1, n, sum);
    // System.out.println(i);
    // }

    public static void main(String[] args) {
        // printSum(1, 5, 0);
        int n = 5;
        int ans = calculateFactorial(n);
        System.out.println(ans);
    }
}
