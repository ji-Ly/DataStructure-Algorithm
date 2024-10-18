package com.hly.ologn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BinarySearch {
	
	
	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		int target = 45;
		
		int result = searchBinary(array, target);
		
		if(result != -1) System.err.println(result);
		else System.out.println("not foulf");
		
	}
	public static int searchBinary(int[] array, int target) {
		int low = 0;
		int hight = array.length - 1;
		
		while(low <= hight) {
			int middle = low + (hight - low)/2;       // lay ra so giua dona min va max
			int value = array[middle];
			System.out.println("Middle is: " + middle);
			
			if(value < target) low = middle + 1;     
			else if(value > target) hight = middle - 1;
			else return middle;	
			
		}
		return - 1;
	}
	
	
}
