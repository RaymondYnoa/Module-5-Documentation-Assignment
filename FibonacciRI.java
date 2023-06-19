/* CEN 3024C
 * Module 5 Documentation Assignment
 * Author: Raymond Ynoa
 * 
 * Part I.
 * Implement the Fibonacci function in both a recursive and iterative fashion.
 * What’s the runtime efficiency of each? You can look up sample programs - there
 * are many out there - but for your own experience, please type yours from scratch. 
 * Turn in a chart of the results, with time on the Y axis, and input on the X axis,
 * Please use nanosecond.  long startTime = System.nanoTime(); This chart must not
 * be hand written.
 */

public class FibonacciRI {

	public static void main(String[] args) {
		int n = 20; // Last input in series of executions.
		
		// Solve for Fibonacci sequence using recursive algorithm.
		System.out.println("Fibonacci Series (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
		System.out.println("\n"); // Double space.
		
		// Solve for Fibonacci sequence using iterative algorithm.
		System.out.println("Fibonacci Series (Iterative):");
	    for (int i = 0; i < n; i++) {
	        System.out.print(fibonacciIterative(i) + " ");
	    }
	    System.out.println("\n"); // Double space.
		
	    
		// Print chart of input and execution time for recursive and iterative methods.
		System.out.println("Fibonacci Series Execution Time (in nanoseconds):");
        System.out.println("Input\tRecursive\tIterative");
        
        for (int i = 0; i <= n; i++) { // From 0 to n.
        	
        	// Fibonacci recursive execution time.
            long startTimeRecursive = System.nanoTime(); // Start time (in nanoseconds).
            fibonacciRecursive(i); // Execute Fibonacci sequence using recursive algorithm.
            long endTimeRecursive = System.nanoTime(); // End time (in nanoseconds).
            long executionTimeRecursive = endTimeRecursive - startTimeRecursive; // Solve for execution time.

            // Fibonacci iterative execution time.
            long startTimeIterative = System.nanoTime(); // Start time (in nanoseconds).
            fibonacciIterative(i); // Execute Fibonacci sequence using iterative algorithm.
            long endTimeIterative = System.nanoTime(); // End time (in nanoseconds).
            long executionTimeIterative = endTimeIterative - startTimeIterative; // Solve for execution time.

            System.out.printf("%d\t%d\t\t%d%n", i, executionTimeRecursive, executionTimeIterative); // Print results.
        }

	}
	
	public static int fibonacciRecursive(int n) { // Fibonacci sequence using recursive algorithm.
        if (n <= 1) {  // Base case for 0 and 1.
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Solve for the nth term.
    }
	
	public static int fibonacciIterative(int n) { // Fibonacci sequence using iterative algorithm.
        if (n <= 1) { // Base case for 0 and 1.
            return n;
        }
        int fib = 1; // Current Fibonacci number.
        int prevFib = 1; // Previous Fibonacci number.

        for (int i = 2; i < n; i++) { // Numbers equal to 2 and greater.
            int temp = fib; // Temporarily store current Fibonacci number.
            fib += prevFib; // Solve for current nth term.
            prevFib = temp; // Update previous Fibonacci number.
        }
        return fib;
    }

}
