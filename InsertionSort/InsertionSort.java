import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int i;
		int key;
		for (int j = 1; j < arr.length; ++j) {
			key = 	arr[j];
			i   = 	j-1;
			
			while (i>=0 && arr[i] > key) {
				arr[i+1] = arr[i];
				i = i-1;
			}
			
			arr[i+1] = key;
		}
	}
	
	//Working test driver
	public static void main(String[] args) {
		int[] arr = {1000000,310,3,450000,10000000,799999,30};
		System.out.println(Arrays.toString(arr));
		long start = System.nanoTime();
		insertionSort(arr);
		long stop = System.nanoTime();
		System.out.println(Arrays.toString(arr));
		
		long time = stop - start;
		System.out.println("Insertion sort complete. " + time + " nanoseconds elapsed.");
	}
}
