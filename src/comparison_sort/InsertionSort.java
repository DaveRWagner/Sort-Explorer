package comparison_sort;
/**
 * This is an implementation of the Insertion Sort algorithm adapted for java from the 
 * pseudocode presented in the third edition of Introduction to Algorithms by
 * Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest and Clifford Stein
 * @author David Wagner
 */
public class InsertionSort extends ComparisonSort {
	
	/**
         * An implementation of the insertion sort algorithm from Introduction
         * to Algorithms by CLRS
         * @param list the list of integers to be sorted
         * @return the number of comparisons required to sort the list
         */
	public int sort(int[] list) {
		sorted = list.clone();
		unsorted = list;
		comparisons = 0;
		int key, i;
		for(int j = 1; j<sorted.length; j++)
		{
			key = sorted[j];
			i = j-1;
			while (i>=0 && sorted[i]>key)
			{
				sorted[i+1] = sorted[i];
				comparisons++;
				i--;
			}
			comparisons++;
			sorted[i+1]=key;
		}
		return comparisons;
	}
	
        /**
         * 
         * @return a written description of the insertion sort algorithm
         */
	public String about(){
		return "Insertion sort works by selecting an element from a list (this implementation selects"
				+ " the highest-indexed element) and comparing it to each element"
                                + " until it is compared to an element with a lower key "
				+ "value, which the selected element is inserted after. This process is repeated "
				+ "until every element has been inserted to its proper place. \n\n"
				+ "Insertion sort has the desirable quality of only requiring n-1 comparisons "
				+ "for a list size n iff that list is already sorted. The tradeoff is that the "
				+ "worst case for insertion sort, a reverse-ordered list, will require "
				+ "about n^2 comparisons to sort a list size n. That isn't too horrible-- but there exists "
				+ "more efficient sorting algorithms for large lists.";
	}

}
