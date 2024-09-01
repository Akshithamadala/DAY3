public class OperationChoices {

    public static int performOperation(int c, int a, int b) {
        switch (c) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return Integer.MAX_VALUE; // or some other error indicator
                }
            default:
                System.out.println("Invalid operation choice.");
                return 0; // Default value in case of invalid choice
        }
    }

    public static void main(String[] args) {
        int c = 2; // Operation choice
        int a = 15;
        int b = 20;

        int result = performOperation(c, a, b);
        System.out.println("Output: " + result);
    }
}
