public class DifferenceOfSum {

    public static int differenceOfSum(int a, int b) {
        int sumNotDivisibleByB = 0;
        int sumDivisibleByB = 0;

        for (int i = 1; i <= a; i++) {
            if (i % b == 0) {
                sumDivisibleByB += i;
            } else {
                sumNotDivisibleByB += i;
            }
        }

        // Calculating the difference between the two sums
        int difference = sumNotDivisibleByB - sumDivisibleByB;
        return difference;
    }

    public static void main(String[] args) {
        int a = 30; // Given value of a
        int b = 6;  // Given value of b

        int result = differenceOfSum(a, b);
        System.out.println("Output: " + result);
    }
}

