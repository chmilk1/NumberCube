
// Copyright Wintriss Technical Schools 2013

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCubeTest {

	/*
	 * READ QUESTION 1: http://apcentral.collegeboard.com/apc/public/repository/ap09_frq_computer_science_a.pdf Try to
	 * answer on paper.
	 */

	@Test
	public void testPartA() {
		//This Part Is Intentonaly Left Blank
	}

	@Test
	public void testPartB() throws Exception {
		int[] testValues0 = { 1, 2, 2, 2, 3 };
		assertEquals(1, NumberCubeQuestion.getLongestRun(testValues0));
		int[] testValues = { 1, 5, 5, 2, 2, 2, 5, 5 };
		assertEquals(3, NumberCubeQuestion.getLongestRun(testValues));
		int[] testValues2 = { 1, 5, 5, 4, 3, 2, 2, 2, 2, 2, 6, 1, 3, 3, 3, 5, 5, 5 };
		assertEquals(5, NumberCubeQuestion.getLongestRun(testValues2));
	}
	@Test
	public void testPartC() throws Exception {
		
	}

}

class NumberCube {

	int testIndex = 0;
	int[] values;

	public int toss() {
		return values[testIndex++];
	}

	public void setValues(int[] testValues) {
		this.values = testValues;

	}

	public int[] getValues() {
		return values;
	}
}
