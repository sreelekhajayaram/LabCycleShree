import java.util.Scanner;

public class CountPositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive numbers = " + positive);
        System.out.println("Negative numbers = " + negative);
        System.out.println("Zeros = " + zero);

        sc.close();
    }
}
