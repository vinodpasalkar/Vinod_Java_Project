import java.util.Scanner;

public class FibonacciSum {
	public static void main(String [] args) {
        int a; 
        int b = 0;
        int c = 1;
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a upper limit number for Fibonacci series : ");
        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();
        // Finds fibonacci sequence below 100 and keep on adding even numbers
          while(c <= number) {
        		a = b; // 0 1 2 3 5 8 13 21 34 55
            b = c; // 1 2 3 5 8 13 21 34 55 89
            c = a + b;

            if (c % 2 == 0 && c <=number)  // Check if it's even
                sum += c;
        }
        System.out.println("Sum of even numbers in the Fibonacci series is "+sum);
    }
}

