import java.util.Arrays;
import java.util.Random;

/**
 * Author: Brennan Duffy
 * Date: 12/3/2022
 */

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] unsorted = {1, 3, 5, -2, 3, 88, 0};

        System.out.println(Arrays.toString(unsorted));
        long startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(selectionSort(unsorted)));
        long endTime = System.currentTimeMillis();
        System.out.println("Time to sort: " + (endTime - startTime) + "ms");

        System.out.println();

        int[] unsortedExtra = new int[10000];
        for (int i = 0; i < 10000; i++) {
            unsortedExtra[i] = new Random().nextInt(10000);
        }

        System.out.println(Arrays.toString(unsortedExtra));
        startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(selectionSort(unsortedExtra)));
        endTime = System.currentTimeMillis();
        System.out.println("Time to sort: " + (endTime - startTime) + "ms");
    }

    /**
     * Sorts an array of integers using a selection sort algorithm
     * @param unsortedArray the unsorted array
     * @return the array, sorted
     */
    public static int[] selectionSort(int[] unsortedArray) {
        // should probably clone the array here or something but this works fine for the scope of the assignment
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int lowest = unsortedArray[i];
            int lowestIndex = i;
            for (int ii = i + 1; ii < unsortedArray.length; ii++) {
                if (unsortedArray[ii] < lowest) {
                    lowest = unsortedArray[ii];
                    lowestIndex = ii;
                }
            }
            unsortedArray[lowestIndex] = unsortedArray[i];
            unsortedArray[i] = lowest;
        }
        return unsortedArray;
    }
}
