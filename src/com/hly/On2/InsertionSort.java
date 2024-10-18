package com.hly.On2;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] array = {9, 1, 8, 2, 7, 3, 6, 5, 4};
		
		insertionSort(array);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		
		

	}

	private static void insertionSort(int[] array) {
		
		for(int i = 1; i < array.length; i++) {  // lay tu phan tu thu 2 
			int temp = array[i];       // dat bien tam la phan tu so 2
			int j = i - 1;				// j luon dung truoc i
			
			while(j >= 0 && array[j] > temp) {   // chung nao j con lon hon temp thi con doi
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp; // luc nay bien j bi giam nen phai cong 1 va gan bien temp vao
								// giong hoan doi thoi
		}
		
		
	}

}
