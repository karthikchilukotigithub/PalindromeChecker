import java.util.Scanner;

public class PalindromeChecker {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            // Compare characters from both ends
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrome Checker");
        System.out.println("1. Check Palindrome for String");
        System.out.println("2. Check Palindrome for Number");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1: // String Palindrome Check
                System.out.println("Enter a string: ");
                String str = scanner.nextLine();
                if (isPalindrome(str)) {
                    System.out.println("\"" + str + "\" is a palindrome.");
                } else {
                    System.out.println("\"" + str + "\" is not a palindrome.");
                }
                break;

            case 2: // Number Palindrome Check
                System.out.println("Enter a number: ");
                int num = scanner.nextInt();
                if (isPalindrome(num)) {
                    System.out.println(num + " is a palindrome.");
                } else {
                    System.out.println(num + " is not a palindrome.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please try again.");
        }

        scanner.close();
    }
}
