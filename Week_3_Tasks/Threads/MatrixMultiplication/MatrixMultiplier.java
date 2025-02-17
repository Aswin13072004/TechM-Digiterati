package Week_3_Tasks.Threads.MatrixMultiplication;

public class MatrixMultiplier extends Thread {
    private int[][] A, B, C;
    private int row, col, size;

    public MatrixMultiplier(int[][] A, int[][] B, int[][] C, int row, int col, int size) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
        this.col = col;
        this.size = size;
    }

    @Override
    public void run() {
        // Compute a single element in the result matrix
        C[row][col] = 0;
        for (int k = 0; k < size; k++) {
            C[row][col] += A[row][k] * B[k][col];
        }
    }
}
