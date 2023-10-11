import java.util.Scanner;

public class findOccurance {
    public static int first = -1;
    public static int last = -1;

    public static void FindOccurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curChar = str.charAt(idx);
        if (curChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        FindOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = input.next();
        FindOccurance(str, 0, 'a');
    }
}
