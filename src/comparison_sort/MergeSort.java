package comparison_sort;
/**
 * This is an implementation of the Merge Sort algorithm adapted for java from the 
 * pseudocode presented in the third edition of Introduction to Algorithms by
 * Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest and Clifford Stein
 * @author David Wagner
 */
public class MergeSort extends ComparisonSort {

    /**
     * An implementation of Merge Sort from CLRS
     * @param list the list of integers to be sorted
     * @return the number of comparisons required to sort the list
     */
    public int sort(int[] list) {
        sorted = list.clone();
        unsorted = list;
        comparisons = 0;
        mergeSort(sorted, 0, sorted.length - 1);
        return comparisons;
    }

    /**
     * merges two subarrays together in order
     * @param array subarrays to be merged
     * @param p lowest index of both subarrays
     * @param q index where one subarray ends and the other begins
     * @param r highest index of both subarrays
     */
    private void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        int i, j;
        for (i = 0; i < n1; i++) {
            leftArray[i] = array[p + i];
        }
        for (j = 0; j < n2; j++) {
            rightArray[j] = array[q + j + 1];
        }
        i = j = 0;
        for (int k = p; k <= r; k++) {
            comparisons++;
            if (i >= n1) {
                array[k] = rightArray[j++];
            } else if (j >= n2) {
                array[k] = leftArray[i++];
            } else if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i++];
            } else {
                array[k] = rightArray[j++];
            }

        }
    }

    /**
     * Calls the merge sort method
     * @param array subarray to be sorted
     * @param p lowest index element of the subarray
     * @param r highest index element of the subarray
     */
    private void mergeSort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }
    
    /**
     * 
     * @return A string description of Merge Sort
     */
    public String about(){
        return "Merge Sort is a stable divide-and-conquer algorithm which works "
                + "by recursively dividing a list up until the elements are in "
                + "lists with a length of one, then merging the lists back together in order. "
                + "\n\n" +
                "Merge Sort is useful because it only requires an efficient n*log(n) "
                + "comparisons regardless of the initial order of the list.  "
                + "However, it has the \"hidden overhead\" of requiring the creation"
                + " of additional arrays representing the divided up list. Also,"
                + " due to its recursive design, it requires multiple pushes to "
                + "the call-stack and implementing it is error-prone.";
    }
}
