import java.util.Arrays;

public class MergeSort {
	
	public static void insertMergeSort(int[] arr, int minSize) {
		insertMergeSort(arr, 0, arr.length-1, minSize);
	}
	
	public static void insertMergeSort(int[] arr, int l, int r, int minSize) {
		//System.out.println(r-l < minSize);
		if (r - l < minSize) {
			int[] temp = Arrays.copyOfRange(arr, l, r);
			InsertionSort.insertionSort(temp);
			for (int i = 0; i < temp.length; i++) {
				arr[l+i] = temp[i];
			}
		}
		else {
			int m = (l+r)/2;
			insertMergeSort(arr, l, m, minSize);
			insertMergeSort(arr, m+1, r, minSize);
			merge(arr, l, m, r);
		}
	}
	
	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l+r)/2;
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			merge(arr, l, m, r);
		}
	}
	
	public static void merge(int[] arr, int p, int q, int r) {
		int n_1 = q - p + 1;
		int n_2 = r - q;
		
		int[] L = new int[n_1];
		int[] R = new int[n_2];
		
		for (int i=0; i < n_1; ++i) {
			L[i] = arr[p+i];
		}
		for (int j=0; j < n_2; ++j) {
			R[j] = arr[q+j+1];
		}
		
		int i = 0;
		int j = 0;
		int k = p;
		while (i < n_1 && j < n_2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n_1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n_2) {
			arr[k] = R[j];
			j++;
			k++;
		}
			
	}
		
	
	
	public static void main(String[] args) {
		int[] arr = {5,98,42,-100,25,100,22};
		insertMergeSort(arr, 7);
		
		System.out.println(Arrays.toString(arr));
	}
}


