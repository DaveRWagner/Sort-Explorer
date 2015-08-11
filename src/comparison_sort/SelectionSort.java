package comparison_sort;
/**
 * This is an implementation of the Selection Sort algorithm adapted for java from the 
 * pseudocode presented in the third edition of Introduction to Algorithms by
 * Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest and Clifford Stein
 * @author David Wagner
 */
public class SelectionSort extends ComparisonSort {
	/**
         * An implementation of the Selection sort algorithm from Introduction
         * to Algorithms by CLRS
         * @param list the list of integers to be sorted
         * @return the number of comparisons required to sort the list
         */
	public int sort(int[] list) {
		sorted = list.clone();
		comparisons = 0;
		for (int i = 0; i<sorted.length-1; i++){
			for (int j = i+1; j<sorted.length;j++)
			{
				comparisons++;
				if (sorted[i]>sorted[j])
				{
					int swap = sorted[i];
					sorted[i] = sorted[j];
					sorted[j]= swap;
				}
			}
		}
		return comparisons;
	}
        
        /**
         * 
         * @return a string description of Selection Sort
         */
        public String about(){
            return "Selection sort is an iterative sort algorithm which works by"
                    + " selecting an element and putting it directly in place. "
                    + "It begins by parsing through the entire list and selecting"
                    + " the smallest element and swapping it into the first place"
                    + " in the list. Then it selects the next smallest element, "
                    + "skipping the already in-place element, and swaps it in the"
                    + " next place in the list. It continues to do this for every"
                    + " element in the list (except the largest element, which "
                    + "is implicitly put in place by nature of every element "
                    + "being put in its proper place) until the list is "
                    + "completely sorted.\n\n" +
                    "Since selection sort works by comparing each element to "
                    + "every yet-unsorted element each iteration it requires "
                    + "the same number of comparisons for a particular size list"
                    + " regardless the list’s initial order, therefor selection "
                    + "sort has no best- or worst-case. Unfortunately, selection "
                    + "sort is not a particularly efficient sorting algorithm, "
                    + "with a runtime of n^2. However, because it is intuitively "
                    + "easy to understand and program it may still be a "
                    + "good choice for small lists.";
        }

}
