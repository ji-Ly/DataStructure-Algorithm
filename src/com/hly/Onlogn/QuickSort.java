package com.hly.Onlogn;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
		
		quickSort(array, 0, array.length - 1);
		
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	private static void quickSort(int[] array, int start, int end) {
		
		//end ma <= start thi dung ham luon khong noi nhieu
		if(end <= start) return;
		
		// pivot la diem chia mang
		int pivot = partition(array, start, end);
		
		// goi de quy de sort ham khi da chia mang thanh 2 lay pivot lam goc de chia
		//pivot nam im khong sort
		
		quickSort(array, start, pivot -1);
		quickSort(array, pivot + 1, end);
		//de quy cu chay hoai chi den khi thoa dieu kien dung
		
	}
	
	//ham partition tra ve vi tri cua pivot
	private static int partition(int[] array, int start, int end) {
		//luc dau pivot nam o cuoi mang
		int pivot = array[end];
		// i thi luc nao cung nam truoc start 1 nháy
		int i = start -1;
		
		//cho chay tu star den end - 1 vi end la pivot khong tinh
		for(int j = start; j <= end -1; j++) {
			//neu j < pivot thi i tang len de doi
			if(array[j] < pivot) {
				i++;
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		
		//xong thi ghep mang vao voi pivot
		// nen i tang len vao cho pivot roi thay doi
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		
		
		return i;
	}

}
