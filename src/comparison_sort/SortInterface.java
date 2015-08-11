package comparison_sort;
/**
 * provides an interface for sort algorithms
 * @author DWagner
 *
 */
public interface SortInterface {
	
	/**
	 * Sorts the given integer array in ascending order
	 * returns the number comparison operations which had to be executed in order for the
	 * list to be sorted with the given algorithm. In comparison based sorting, this is
	 * the comparison between two elements.
	 * @param list a presumably unsorted list of integers
	 * @return the number of comparisons used in sort
	 */
	int sort(int[] list);
	
        /**
         * Returns the number of basic operations required to sort the most recently passed parameter list.
         * @return the number of basic operations required to sort the most recently passed parameter list. 
         * 
         */
	int basicOperations();
	
	/**
	 * Returns the list which was sorted, prior to sorting
     * @return the unsorted list passed to the class
	 */
	int[] unsortedList();
	
	/**
	 * Returns the most recently sorted list so a skeptic could check its order
	 * @return the most recently sorted list
	 */
	int[] sortedList();
	
	/**
	 * Checks that the most recently sorted list is indeed sorted in ascending order
	 * @return true if the list is ordered
	 */
	boolean checksort();
	 
	/**
	 * Gives a written description of the algorithm used in this sort 
	 * @return a written description of the algorithm used in this sort
	 */
	String about();

}
