import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer (A): ");
        int a = sc.nextInt();

        System.out.print("Enter second integer (B): ");
        int b = sc.nextInt();

        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0) {
            System.out.println("Division = " + (a / b));
            System.out.println("Modulus = " + (a % b));
        } else {
            System.out.println("Division = Cannot divide by zero");
            System.out.println("Modulus = Cannot divide by zero");
        }

        sc.close();
    }
}
