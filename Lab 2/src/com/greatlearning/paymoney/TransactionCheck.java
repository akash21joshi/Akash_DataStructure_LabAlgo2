package com.greatlearning.paymoney;

import java.util.Scanner;

public class TransactionCheck {
	
	static Scanner sc = new Scanner(System.in);
	static int transaction[];
	static int target_arr[];
	
	private static int noOfTransaction(int[] transaction,int size, int target) {
		int sum =0;
		for (int i=0;i<=size; i++) {
			sum = sum + transaction[i];
			if (sum>= target) {
				return i+1;
			}
		}
		
		
		return -1;
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter Size :");
		int transactionSize = sc.nextInt();
		transaction = new int[transactionSize];
		for (int i =0; i <transactionSize; i++) {
			System.out.println("enter the "+ i + " element");
			transaction[i] = sc.nextInt();
		}
		
		System.out.println("enter target Size :");
		int targetSize = sc.nextInt();
		target_arr = new int[targetSize];
		
		for (int i =0; i <targetSize; i++) {
			System.out.println("enter the "+ i + " target element");
			target_arr[i] = sc.nextInt();
			int val = noOfTransaction(transaction, transactionSize, target_arr[i]);
			if (val>0) {
				System.out.println("target is achievable");
			}
			else {
				System.out.println("target is not achievable");
			}
		}
		
		
		
		
		

	}

}
