package Recursion;

public class Greetings {
    int count;

    public void greet() {
        if (count == 1_000)
            return;

        System.out.println("Hello, World");
        count++;
        greet();
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        greetings.greet();
    }
}
