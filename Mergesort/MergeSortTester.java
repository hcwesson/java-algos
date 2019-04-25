import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeSortTester {

	public static void main(String[] args) {
		test100();
		test1000();
		test5000();
		test10000();
		test50000();
		test100000();
		test500000();
	}
	
	public static void test100() {
		int[] elems = new int[100];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_100.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		MergeSort.mergeSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("100 elements merge-sorted in " + time + " nanoseconds.");
	}

	public static void test1000() {
		int[] elems = new int[1000];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_1000.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		MergeSort.mergeSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("1000 elements merge-sorted in " + time + " nanoseconds.");
	}
	
	public static void test5000() {
		int[] elems = new int[5000];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_5000.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		MergeSort.mergeSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("5000 elements merge-sorted in " + time + " nanoseconds.");
	}
	
	public static void test10000() {
		int[] elems = new int[10000];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_10000.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		MergeSort.mergeSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("10000 elements merge-sorted in " + time + " nanoseconds.");
	}
	
	public static void test50000() {
		int[] elems = new int[50000];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_50000.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		MergeSort.mergeSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("50000 elements merge-sorted in " + time + " nanoseconds.");
	}
	
	public static void test100000() {
		int[] elems = new int[100000];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_100000.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		MergeSort.mergeSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("100000 elements merge-sorted in " + time + " nanoseconds.");
	}
	
	public static void test500000() {
		int[] elems = new int[500000];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_500000.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		MergeSort.mergeSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		System.out.println("500000 elements merge-sorted in " + time + " nanoseconds.");
	}
}
