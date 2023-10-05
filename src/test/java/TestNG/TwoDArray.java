package TestNG;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {

		int[] v1 = { 10, 20, 30, 40 };

		int[] v2 = { 11, 12, 13, 14 };

		int[] v3 = { 21, 22, 23, 24 };

		int[][] array = { { 10, 20, 30, 40 }, { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };
		System.out.println(Arrays.toString(array[0]));
		System.out.println(array[0][2]);

		Object[][] array1 = { { "Kajal", 20, 30, 40 }, { "Ravi", 12, 13, 14 }, { "Dhaval", 22, 23, 24 } };

		System.out.println(Arrays.toString(array1[1]));

	}
}
