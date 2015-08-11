package comparison_sort;

/**
 * This is an implementation of the Quick Sort algorithm adapted for java from
 * the pseudocode presented in the third edition of Introduction to Algorithms
 * by Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest and Clifford
 * Stein
 *
 * @author David Wagner
 */
public class QuickSort extends ComparisonSort {

    /**
     * Implementation of the Quick Sort algorithm adapted for java from the 
     * pseudocode presented in CRLS
     * @param list the list of integers to be sorted
     * @return the number of comparisons required to sort the list
     */
    public int sort(int[] list) {
        sorted = list.clone();
        comparisons = 0;
        quickSort(sorted, 0, sorted.length - 1);
        return comparisons;
    }
    
    /**
     * Calls quicksort on subarrays
     * @param array the array to be sorted
     * @param p the smallest index of the subarray
     * @param r the largest index of the subarray
     */
    private void quickSort(int[] array, int p, int r) {
        if (p < r) {
            int q = partition(array, p, r);
            quickSort(array, p, q - 1);
            quickSort(array, q + 1, r);
        }
    }
    
    /**
     * partition method rearranges the subarray, from p to r, in place
     * @param array the list being sorted
     * @param p the lowest index of the subarray
     * @param r the highest index of the subarray
     * @return the pivots new index
     */
    private int partition(int[] array, int p, int r) {
        int x = array[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            comparisons++;
            if (array[j] <= x) {
                i++;
                int swap = array[i];
                array[i] = array[j];
                array[j] = swap;
            }
        }
        int swap = array[++i];
        array[i] = array[r];
        array[r] = swap;
        return i;
    }
    
    /**
     * 
     * @return a string description of Quick Sort
     */
    public String about() {
        return "Quick sort is a divide and conquer algorithm which works by "
                + "recursively selecting an element from a list as a partition "
                + "then relocating the remaining elements in that list by their "
                + "value relative to the partition object. This implementation "
                + "uses the first element of the parameter list as the partition "
                + "to allow demonstration of worst-case run times, thus running "
                + "this implementation on an already sorted or reverse-ordered "
                + "list is analogous to a recursive selection-sort. Using an "
                + "implementation which selects a randomized partition makes "
                + "encountering a worst-case runtime less likely in practice.\n\n" +
                "Quick Sort’s average case is an efficient n*log(n) comparisons, making it a "
                + "quality choice for sorting an unordered list. Quick Sort algorithm can "
                + "also be generalized to solve other problems, such as the “Nuts"
                + " and Bolts” (aka “Key and Lock”) problem. The drawbacks of "
                + "Quick Sort include its less-efficient worst case, n^2 "
                + "comparisons, as well its recursive design making "
                + "implementation error-prone. ";
    }
}
