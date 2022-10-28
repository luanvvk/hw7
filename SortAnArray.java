package hw7;

import java.util.*;

public class SortAnArray {

	public static int[] sortArrays(int[] array) {
		int i;
		for (i = 0; i < array.length -1; i = i + 1) {
			
			if (array[i] > array[i + 1]) {

				int x = array[i];
				array[i] = array[i + 1];
				array[i + 1] = x;

				i = -1;
				// i bằng -1 để điều kiện trong for loop tiếp tục là true
			}

		}

		return array;

	}
//O(n) complexity
	public static void main(String args[]) {

		int array[] = { 1, 2, 2, 0, 0, 1, 2, 2, 1 };

		array = sortArrays(array);
		System.out.println("New array : " + Arrays.toString(array));
	}

}
