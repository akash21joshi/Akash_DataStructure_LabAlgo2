package com.greatlearning.currency.domination;

public class Driver {
	static int [] arr;
	static int low;
	static int high;
	//private static IntegerSorting sorting;

	public static void main(String[] args) {
		//sorting = new BubbleSort();
		IntegerSorting sorting = new MergeSort();
		int[] arr = {60,5,12,78,25};
		low = 0;
		high = arr.length;
		
		sorting.sort(arr);
		CurrencyDomination count = new CurrencyDomination();
		for (int i=0; i< high; i++) {
			System.out.println(arr[i]);
		}
		count.calNotesCount(arr,181);

	}

}
