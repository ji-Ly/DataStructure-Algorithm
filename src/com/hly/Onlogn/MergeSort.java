package com.hly.Onlogn;

public class MergeSort {

	public static void main(String[] args) {

		// ta co mang int sau:
		int[] array = { 5, 3, 4, 6, 9, 7, 1, 2, 8 };

		mergeSort(array);

		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	private static void mergeSort(int[] array) {

		if(array.length == 1) return;
		
		// chia mang thanh 2 phan
		int length = array.length;
		int[] leftArray = new int[length / 2];
		int[] rightArray = new int[length - length / 2];

		// gan gia tri cho 2 mang
		int i = 0; // mang trai
		int j = 0; // mang phai

		for (; i < length; i++) {
			if (i < length / 2)
				leftArray[i] = array[i];
			else {
				rightArray[j] = array[i];
				j++;
			}
			

		}
		
		//goi ham de quy tiep tuc chia nho cho den khi chi con 1 phan tu thi dung
		mergeSort(leftArray);
		mergeSort(rightArray);
		
		//sau khi chia mang xong thi bat dau gop
		merge(leftArray, rightArray, array);
	}
	
	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		//kich thuoc 2 mang
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		// vi tri ban dau cua mang chinh, mang trai, mâng phai
		
		int i = 0, l = 0, r = 0;
		
		//cho vao vòng lặp nếu cả 2 mảng còn phần tử thì lặp
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				i++;
				l++;
			}else {
				array[i] = rightArray[r];
				i++;
				r++;
			}
			
			// sap xong roi thi co nhung phan tu o mang chua duoc dem vao
			// neu mang l chua day thi ghep vao
			
			
		}
		while(l < leftSize) {
			array[i] = leftArray[l];
			l++;
			i++;
		}
		while(r < rightSize) {
			array[i] = rightArray[r];
			r++;
			i++;
		}
		
	}
}
