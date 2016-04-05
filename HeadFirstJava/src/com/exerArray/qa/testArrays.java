package com.exerArray.qa;

class testArrays {
public static void main(String[] args) {
	String [] islands = new String[4];
	int [] index = new int [4];
	int ref;
	
	index [0] = 1;
	index [1] = 3;
	index [2] = 0;
	index [3] = 2;
	
	int y = 0; 
	while (y < 4) {

		ref = index [y];
		islands[0] = "Bermuda";
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Conzumel";
		y= y + 1;
		
	System.out.print("island = ");
	System.out.println(islands[ref]);
		
	}
}
}