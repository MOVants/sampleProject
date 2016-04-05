package com.movieTest.qa;
class movietest {
	public static void main(String[] args) {
		movie one = new movie();
		one.title = "Go with the stock";
		one.genre = "Tragic";
		one.rating = -2;
		movie two = new movie();
		two.title = "Lost in cubicle space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		movie three = new movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
		
	}
}