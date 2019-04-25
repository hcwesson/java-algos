import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuickSortTester {


	//flag set to false for suppressing non-data text output, for use in quick copying of time data
	static boolean verbose = true;

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		QuickSort.quickSort(arr, 0, arr.length-1); //Pre-loading the QuickSort class
		
		test16();
		test32();
		test64();
		test128();
		test256();
		test512();
		test1024();
		test2048();
		test4096();
		test8192();
		if (!verbose) {System.out.println("");}
		if (!verbose) {System.out.println("1024 random order: ");}
		testRandom();
		if (!verbose) {System.out.println("1024 sorted ascending: ");}
		testSorted();
		if (!verbose) {System.out.println("1024 sorted descending: ");}
		testReverseSorted();
		if (!verbose) {System.out.println("---End of List---");}
	}
	
	public static void test16() {
		int[] elems = new int[16];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_16.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		
		if (verbose) {
			System.out.println("16 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}

	public static void test32() {
		int[] elems = new int[32];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_32.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("32 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test64() {
		int[] elems = new int[64];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_64.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("64 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test128() {
		int[] elems = new int[128];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_128.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("128 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test256() {
		int[] elems = new int[256];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_256.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("256 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test512() {
		int[] elems = new int[512];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_512.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("512 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test1024() {
		int[] elems = new int[1024];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_1024.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("1024 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test2048() {
		int[] elems = new int[2048];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_2048.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("2048 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test4096() {
		int[] elems = new int[4096];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_4096.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("4096 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void test8192() {
		int[] elems = new int[8192];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/input_8192.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("8192 elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void testRandom() {
		int[] elems = new int[1024];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/Input_Random.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("1024 random elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void testSorted() {
		int[] elems = new int[1024];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/Input_Sorted.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("1024 sorted ascending elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
	
	public static void testReverseSorted() {
		int[] elems = new int[1024];
		int count = 0;
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/Work/javain/Input_ReversedSorted.txt"));
			while (sc.hasNextInt()) {
				elems[count++] = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		long start = System.nanoTime();
		QuickSort.quickSort(elems, 0, elems.length-1);
		long stop = System.nanoTime();
		long time = stop - start;
		if (verbose) {
			System.out.println("1024 sorted descending elements quicksorted in " + time + " nanoseconds.");
		}
		else {
			System.out.println(time);
		}
	}
}
