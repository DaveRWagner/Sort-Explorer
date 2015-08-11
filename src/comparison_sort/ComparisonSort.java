package comparison_sort;

/**
 * Generic superclass for comparison sort classes, with no
 * algorithm implementation for sorting
 * WARNING:: Does not actually sort
 * @author David
 *
 */
public class ComparisonSort implements SortInterface {
	int[] sorted;
	int[] unsorted;
	int comparisons;
	
	public int sort(int[] list) {
		return 0;
	}
	
	public int basicOperations(){
		return comparisons();
	}

        /**
         * Returns the number of comparisons required to sort the most recently passed parameter list
         * @return Number of comparisons required to sort the most recently passed parameter list
         */
	public int comparisons(){
		return comparisons;
	}
	
	public int[] unsortedList() {
		return unsorted;
	}
	
	public int[] sortedList(){
		return sorted;
	}

	
	public boolean checksort() {
		for (int i =0; i<sorted.length-1; i++)
		{
			if (sorted[i]>sorted[i+1]) return false;
		}
		return true;
	}
	
	public String about(){
		return "This is a generic superclass for comparison based sorting classes."
				+ " This doesn't actually sort, if you expect it to you will be sorely "
				+ "disappointed.";
	}

}
