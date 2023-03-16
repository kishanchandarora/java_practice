package java_practice;

//import java.util.Random;

public class QuickSort {
	public void quickSort(int[] array, int lowIndex, int highIndex) {
		if(lowIndex >= highIndex) {
			return;
		}
//		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
//		int pivot = array[pivotIndex];
//		swap(array, pivotIndex, highIndex);
		int leftPointer = extracted(array, lowIndex, highIndex);
		swap(array, leftPointer, highIndex);
		quickSort(array, lowIndex, leftPointer - 1);
		quickSort(array, leftPointer + 1, highIndex);
	}

	private int extracted(int[] array, int lowIndex, int highIndex) {
		int pivot = array[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		while (leftPointer < rightPointer) {
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer ++;
			}
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer --;
			}
			swap(array, leftPointer, rightPointer);
		}
		return leftPointer;
	}
	
	public void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
