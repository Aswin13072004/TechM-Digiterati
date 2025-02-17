package Week_3_Tasks.Threads.Sorting;

public class MultiThreadedMergeSort {
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted Array:");
        printArray(array);

        // Create and start sorting thread
        MergeSortThread sorter = new MergeSortThread(array, 0, array.length - 1);
        sorter.start();

        try {
            sorter.join(); // Wait for sorting to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorted Array:");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

