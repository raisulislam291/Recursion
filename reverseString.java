import java.util.Scanner;

public class reverseString {
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = input.next();
        printRev(str, str.length()-1);
    }
}
