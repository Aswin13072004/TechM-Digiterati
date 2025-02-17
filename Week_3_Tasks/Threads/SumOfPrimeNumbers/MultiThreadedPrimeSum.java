package Week_3_Tasks.Threads.SumOfPrimeNumbers;

import java.util.Scanner;

public class MultiThreadedPrimeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();
        scanner.close();

        int numThreads = 4; // Number of threads
        PrimeCalculator[] threads = new PrimeCalculator[numThreads];
        int chunkSize = limit / numThreads;
        int start = 1;
        long totalSum = 0;

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            int end = (i == numThreads - 1) ? limit : start + chunkSize;
            threads[i] = new PrimeCalculator(start, end);
            threads[i].start();
            start = end + 1;
        }

        // Wait for all threads to finish and sum up the results
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
                totalSum += threads[i].getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + totalSum);
    }
}
