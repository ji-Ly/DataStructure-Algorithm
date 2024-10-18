package com.hly.On2;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
		
		selectionSort(array);
		
		for (int i : array) {
			System.out.print(i);
		}

	}

	private static void selectionSort(int[] array) {

		for(int i = 0; i < array.length - 1; i++) {
			int min = i;
			for(int j = i + 1; j < array.length; j++) {// chon ra flag lam min lay duoc min roi thi doi no di
				if(array[min] > array[j])
					min = j;			
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		
	}

}
