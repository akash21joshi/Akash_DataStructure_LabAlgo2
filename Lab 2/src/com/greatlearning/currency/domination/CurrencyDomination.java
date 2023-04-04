package com.greatlearning.currency.domination;

public class CurrencyDomination {

	public void calNotesCount(int[] sortedDomination, int amount) {
		// TODO Auto-generated method stub
		int notesCount[] = new int[sortedDomination.length];
	try {
			for (int i = 0; i< sortedDomination.length; i++) {
				if (sortedDomination[i]<=amount) {
					notesCount[i] = amount/sortedDomination[i];
					amount = amount%sortedDomination[i];
					if (amount==0) {
						break;
					}
					
				}
				
			}
			if (amount==0) {
				System.out.println("The possible currency domination with count values :");
				for (int i = 0; i< sortedDomination.length; i++) {
					if (notesCount[i]>0) {
						System.out.println(sortedDomination[i]+" : "+ notesCount[i]);
						
						
					}
				}
			}
			
			else {
				System.out.println("The given ammount can not be achieved using highest denomination");
				
			}
			
			

	}
	catch(ArithmeticException ae){
			
			System.out.println("wrong input 0");
			
			
		}
	}

}
