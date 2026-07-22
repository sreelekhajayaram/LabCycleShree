/**
 * Task 14: Display Multiplication Table
 * Problem: Using a loop, display the multiplication table of a given number.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;
        
        System.out.println("Multiplication Table for " + number + ":");
        System.out.println("---------------------------------");
        
        // Loop from 1 to 10 to display the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
