package com.Bottles99.qa;
public class Bottles99 {
	public static void main (String[] args) {
		
		int beerNum = 99;
		String words = "bottles";
		
		while (beerNum > 0) {
			if (beerNum == 1){
				words = "bottles";
				
			}
			System.out.println(beerNum +" " + words + " of beer on the wall");;
			System.out.println(beerNum + " " + words + " of beer");
			System.out.println("Takes one down");
			System.out.println("Pass it Around");
			beerNum = beerNum -1;
			
			if (beerNum > 0) {
				System.out.println ("No more bottles of beer on the wall");
				
			}
					
		}
	}
}