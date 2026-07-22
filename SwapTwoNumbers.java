import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of A: ");
        int a = sc.nextInt();

        System.out.print("Enter value of B: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swap");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swap (Using Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Swap back without temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter Swap (Without Temporary Variable)");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        sc.close();
    }
}
