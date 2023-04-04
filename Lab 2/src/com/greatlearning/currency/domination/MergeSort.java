package com.greatlearning.currency.domination;

public class MergeSort implements IntegerSorting {
	
	
//	static int arr[];
//	static int low;
//	static int high;
	
	private void merge(int[] arr, int low, int high, int mid) {
		int i=low,k=low,j=mid+1;
		int arrBack[];
		arrBack = new int[low+high+1];
		
		while ((i<=mid) && (j<=high)) {
			if (arr[i]<arr[j]) {
				arrBack[k]= arr[j];
				j++;
				k++;
			}
			else {
				arrBack[k]= arr[i];
				i++;
				k++;
			}
		}
		
		while (i<=mid) {
			arrBack[k]=arr[i];
			k++;
			i++;
			
		}
		while (j<=high) {
			arrBack[k]=arr[j];
			k++;
			j++;
			
		}
		
		for (int p=high;p>= low;p--) {
//			System.out.println("length of arrBack" + arrBack[p]);
		
			arr[p] = arrBack[p];
		
			
//			System.out.println("length of arr" + arr[p]);
			
		}
		
	}
	
	private void sort_arr(int[] arr, int low, int high) {
//		low = 0;
//		high = arr.length;
//		System.out.println("sort method called");
//		System.out.println(low);
		
		if (low < high) {
			int mid = (high + low)/2;
			sort_arr(arr, low, mid);
			sort_arr(arr, mid+1, high);
			merge(arr,low,high,mid);
			
		}
		
		
		
	}
	
	public void sort(int[] arr) {
		System.out.println("sort method called");
		System.out.println(arr.length);
		sort_arr(arr, 0, arr.length-1);
	}
		
		
	
	
	

}
