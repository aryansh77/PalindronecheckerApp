<<<<<<< HEAD
import java.util.Scanner;
import java.util.Stack;

=======
>>>>>>> e9ac9b3290b8db18144521961bdc4c12bd6b1616
public class PalindroneCheckerApp {

    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters to create reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
=======
        // Original string
        String original = "madam";

        // Reversed string
        String reverse = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Compare original and reversed string
        if (original.equals(reverse)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is Not a Palindrome");
        }
>>>>>>> e9ac9b3290b8db18144521961bdc4c12bd6b1616
    }
}