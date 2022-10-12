package com.bridgelabz.arrayprogram;

public class AscendingOrderArray {

	public static void main(String[] args) {
	       int [] arr = {2,5,8,4,1,9};
	       int temp = 0;
	       for(int i=0;i< arr.length;i++) {
	    	   for(int j= i; j< arr.length;j++) {
	    		   if(arr[i]> arr[j]) {
	    			   temp = arr[i];
	    			   arr[i]= arr[j];
	    			   arr[j]= temp;
	    		   }
	    	   }
	       }
	       System.out.println("The Ascending order of array is:");
	       for (int j=0;j < arr.length;j++) {
	    	   System.out.print(" "+ arr[j] + " ");
	       }

	}

}
