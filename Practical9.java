import java.util.Scanner;

class Practical9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Checking a word is Palindrome or not

        // First Approach
        System.out.print("Enter the word: ");
        String str = sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();

        System.out.println("The Original Word: " + str);

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("The word " + str + " is Palindrome.");
        } else {
            System.out.println("The word " + str + " is not Palindrome.");
        }

        // Second Approach
        System.out.print("Enter another word: ");
        String str1 = sc.nextLine();

        String reverse = "";

        for (int i = str1.length() - 1; i >= 0; i--) {
            reverse = reverse + str1.charAt(i);
        }

        System.out.println("The Original Word: " + str1);

        if (str1.equalsIgnoreCase(reverse)) {
            System.out.println("The word " + str1 + " is Palindrome.");
        } else {
            System.out.println("The word " + str1 + " is not Palindrome.");
        }

        sc.close();
    }
}
