package utils;

import java.util.ArrayList;

public class ArrayUtils {
	
	public static int[] toIntArray (ArrayList<Integer> list) {
		int[] array = new int[list.size()];
		
		for (int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		return array;
	}

}
