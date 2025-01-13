public class FibonacciSequence {
    /**
     * Calculates the nth Fibonacci number using recursion.
     *
     * @param term the position of the term in the Fibonacci sequence (n)
     * @return the nth Fibonacci number
     */
    /**Added Javadoc comments to calculateFibonacci method*/
    // Method to compute the nth Fibonacci number using recursion
    public static int calculateFibonacci(int term) {
        if (term == 0) {
            return 0; // Base case for 0th term
        } else if (term == 1) {
            return 1; // Base case for 1st term
        }
        // Recursive call for the sum of the previous two terms
        return calculateFibonacci(term - 1) + calculateFibonacci(term - 2);
    }

    public static void main(String[] args) {
        int position = 10; // Define which term we want to find
        int fibonacciValue = calculateFibonacci(position); // Compute the Fibonacci valuea

        // Display the result with a meaningful descriptionS
        System.out.println("The " + position + "th term in the Fibonacci sequence is " + fibonacciValue + ".");
    }
}
