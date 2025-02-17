package Week_3_Tasks.Threads.MatrixMultiplication;

public class MultiThreadedMatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rows = A.length;
        int cols = B[0].length;
        int size = A[0].length; // Number of columns in A (must match rows in B)

        int[][] C = new int[rows][cols];

        // Create threads for each element in result matrix
        MatrixMultiplier[][] threads = new MatrixMultiplier[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                threads[i][j] = new MatrixMultiplier(A, B, C, i, j, size);
                threads[i][j].start();
            }
        }

        // Wait for all threads to finish
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        // Print the result matrix
        System.out.println("Result Matrix:");
        printMatrix(C);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

