package list_manager;

import java.util.Random;
/**
 * A class for generating integer arrays in order or in random order
 * @author DWagner
 *
 */
public class ListGenerator {
	public ListGenerator(){}
        
        /**
         * Generates an ordered integer array of parameter size
         * @param size the size of list to be generated
         * @return an ordered integer array of parameter size
         */
	public int[] ascending(int size){
		int[] generated;
		generated = new int[size];
		for (int i =0; i<size; i++)
		{
			generated[i] = i+1;
		}
		return generated;
	}
	
        /**
         * Generates a reverse-ordered integer array of parameter size
         * @param size the size of list to be generated
         * @return a reverse-ordered integer array of parameter size
         */
	public int[] descending(int size){
		int[] generated;
		generated = new int[size];
		for (int i =size; i>0; i--)
		{
			generated[size-i] = i;
		}
		return generated;
	}
        
        /**
         * An implementation of the Fisher–Yates Shuffle (or Knuth Shuffle) algorithm
         * adapted for java from the wikipedia description of the algorithm
         * @param size the size of list to be generated
         * @return a randomly ordered array of integers of the parameter size
         */
        public int[] random(int size){
		int[] generated = ascending(size);
		Random randomgen = new Random();
		int randomIndex, randomKey;
		for (int i = size-1; i> 0; --i)
		{
			randomIndex = randomgen.nextInt(i+1);
			randomKey = generated[randomIndex];
			generated[randomIndex] = generated[i];
			generated[i] = randomKey;			
		}
		return generated;
	}
}
