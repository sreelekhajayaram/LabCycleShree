public class MenuDrivenCalculator {
    public static void main(String[] args) {

        int choice = 3;
        int a = 5;
        int b = 6;
        int result;

        switch (choice) {
            case 1:
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case 2:
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case 3:
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case 4:
                result = a / b;
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
