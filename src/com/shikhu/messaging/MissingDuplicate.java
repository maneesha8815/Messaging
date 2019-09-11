package com.shikhu.messaging;

public class MissingDuplicate {
	
	String name;

	public static void main(String[] args) {
	
		
		int[] input = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
		int[] resister = new int[input.length];
		
		for (int i : input) { //  1 

//			System.out.println(i);
			
			resister[i] = 1;
			
		}

		System.out.println("missing numbers in given array");

		for (int i = 1; i < resister.length; i++) {

				if (resister[i] == 0) {
					
					System.out.println(i);
				
				}
		}
		
	}
}
