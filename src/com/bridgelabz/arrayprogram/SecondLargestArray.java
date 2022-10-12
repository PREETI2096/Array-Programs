package com.bridgelabz.arrayprogram;

public class SecondLargestArray {
	
	public static void main(String[] args) {
		int largest =0;
		int secondLargest = 0;
	    
		int [] arr = {3,5,8,9,45,64};
		
		for (int i = 0; i < arr.length;i++) {
			
			if(arr[i] > largest) {  //3 > 0,5 >3,8>9,9>45,45>64
			secondLargest = largest; //3,5,8,9,45,64
			largest = arr[i]; // 3,5,8,9,45,64
			}
			else if (arr[i] > secondLargest) { //3>0,5>3,8>5,9>8,45>9
				secondLargest = arr[i];  //3,5,8,9,45
				}
			}
		System.out.println("The second largest number is:" +secondLargest);
	}
}
