import java.util.Scanner;

public class Tower_of_Hanoi {
    public static void towerOfHanio(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disks " + n + " from " + src + " to " + dest);
            return;
        }
        towerOfHanio(n - 1, src, dest, helper);
        System.out.println("transfer disks " + n + " from " + src + " to " + dest);
        towerOfHanio(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        // int n = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        towerOfHanio(n, "S", "H", "D");
    }
}
