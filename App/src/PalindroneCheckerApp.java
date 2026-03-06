import java.util.*;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        int length = str.length();

        // Insert characters into both structures
        for (char c : str.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        int count = 0;

        // Compare characters
        while (!stack.isEmpty()) {

            char fromStack = stack.pop();
            char fromQueue = queue.poll();

            if (fromStack == fromQueue) {
                count++;
            }
        }

        if (count == length) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }

        sc.close();
    }
}