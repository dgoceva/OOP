package utils;

public class SelectionSortUtils {
	public static int[] doSort(int[] array) {
		for (int i=0;i<array.length;++i) {
			int ind = i;
			for(int j=i+1;j<array.length;++j) {
				if (array[j]<array[ind]) {
					ind = j;
				}
			}
			
			int temp = array[ind];
			array[ind] = array[i];
			array[i] = temp;
		}
		
		return array;
	}
}
