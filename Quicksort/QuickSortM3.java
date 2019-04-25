import java.util.Arrays;

public class QuickSortM3 {
	
	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}

	public static void quickSort(int[] arr, int p, int r) {
		if (p < r) {
			int n = r - p + 1;
			int m = median3(arr, p, p + n/2, r);
			int temp = arr[r];
			arr[r] = arr[m];
			arr[m] = temp;
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
	
	public static int median3(int[] arr, int p, int q, int r) {
		int innerMin = Math.min(arr[p], arr[r]);
		int innerMax = Math.max(arr[p], arr[r]);
		int outerMin = Math.min(innerMax, arr[q]);
		int median   = Math.max(innerMin, outerMin);
		
		int idx = p;
		if (median == arr[q])      {idx = q;}
		else if (median == arr[r]) {idx = r;}
		
		return idx;
	}
	
	public static void main(String[] args) {
		int[] test = {10,9,8,7,6,5,4,3,2,1};
		int p = 0;
		int r = test.length-1;
		int n = r - p + 1;
		quickSort(test);
		System.out.println(Arrays.toString(test));
//		System.out.println(median3(test, 0, n/2, r));
	}
}
