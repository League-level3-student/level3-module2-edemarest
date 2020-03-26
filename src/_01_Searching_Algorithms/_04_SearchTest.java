package _01_Searching_Algorithms;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] word = {"cat", "dog", "bird"};
		assertEquals(0,_00_LinearSearch.linearSearch(word, "cat"));
		assertEquals(-1,_00_LinearSearch.linearSearch(word, "lizard"));
		assertEquals(1,_00_LinearSearch.linearSearch(word, "dog"));
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] ints = {1, 2, 3, 4, 5};
		assertEquals(1, _01_BinarySearch.binarySearch(ints, 0, 4, 2));
		//System.out.println(_01_BinarySearch.binarySearch(ints, 0, 4, 2));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] ints = {10, 20, 30, 40, 50};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(ints, 30));
		System.out.println(_02_InterpolationSearch.interpolationSearch(ints, 30));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
