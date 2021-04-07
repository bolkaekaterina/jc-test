package by.htp.task02.main;

import org.junit.Assert;
import org.junit.Test;

public class FunctionTest1 {
	
	@Test
	public void firstNumberPositiveTest() {
		int[] arr = { 8, 2, -6, 7, 8, 0, 9, 0 };
		boolean actualPositive;
		actualPositive = Functions.isFirstNumberInArrayPositive(arr);
		Assert.assertTrue(actualPositive);
	}

}
