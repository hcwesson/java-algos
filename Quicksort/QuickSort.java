import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p ,r);
			quickSort(arr, p, q-1);
			quickSort(arr, q+1, r);
		}
	}
	
	public static int partition(int[] arr, int p, int r) {
		int x = arr[r];
		int j = p-1;
		
		for (int i = p; i < r; i++) {
			if (arr[i] <= x) { 
				j++;
				int temp = arr[j];
				arr[j]   = arr[i];
				arr[i]   = temp;
			}
		}
		int temp = arr[j+1];
		arr[j+1] = arr[r];
		arr[r]   = temp;
		
		return j+1;
	}
	
	public static void main(String[] args) {
		int[] test = {5,6,2,3,9,5,23,2,100,4,78};
		System.out.println(Arrays.toString(test));
		quickSort(test, 0, test.length-1);
		System.out.println(Arrays.toString(test));
	}

	
	
}
