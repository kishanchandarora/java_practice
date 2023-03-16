package java_practice;

public class BinarySearch {
	
//	int[] numbers = {1, 3, 4, 6, 8, 9, 32};
//	BinarySearch bs = new BinarySearch();
//	System.out.println(bs.binarySearch(numbers, 32));
	public int binarySearch(int[] array, int numberToFind) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (numberToFind == array[mid])
				return mid;
			if (numberToFind < array[mid])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
}
