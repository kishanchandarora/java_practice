package java_practice;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		int[] numbers = new int[10];
		for(int i = 0; i<numbers.length;i++) {
			numbers[i] = random.nextInt(100);
		}
		QuickSort qs = new QuickSort();
		
		System.out.println("Before:: ");
		printArray(numbers);
		qs.quickSort(numbers, 0, numbers.length-1);
		System.out.println("\nAfter:: ");
		printArray(numbers);
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i ++) {
			System.out.println(array[i]);
		}
	}
}
