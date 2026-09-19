import java.util.Scanner;

public class Practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int temp = num;
        int reversed = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + reversed);

        System.out.print("\nEnter a number to check prime: ");
        int primeNum = sc.nextInt();
        boolean isPrime = true;
        int i = 2;
        if (primeNum <= 1) {
            isPrime = false;
        } else {
            do {
                if (primeNum % i == 0 && primeNum != 2) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i <= primeNum / 2);
        }
        if (isPrime) {
            System.out.println(primeNum + " is a Prime Number.");
        } else {
            System.out.println(primeNum + " is not a Prime Number.");
        }

    System.out.print("\nEnter the nth term of Fibonacci sequence: "); //QUESTION 3 :- nth term of fibonaccisequence using for loop.
    
    int fibo = sc.nextInt();
    int first = 0;
    int second = 1;
    int fibonacci;
    System.out.print("Fibonacci Sequence: ");
    for (int j = 1; j <= fibo; j++) {
    System.out.print(first + " ");
    fibonacci = first + second; 
    first = second;
    second = fibonacci;
    break;
}
    System.out.println();
    sc.close(); 
} 
}