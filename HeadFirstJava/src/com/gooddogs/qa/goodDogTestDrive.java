package com.gooddogs.qa;

public class goodDogTestDrive {
public static void main(String[] args) {
	GoodDogs one = new GoodDogs();
	one.setSize(70);
	GoodDogs two = new GoodDogs();
	two.setSize(8);
	System.out.println("Dog one: " + one.getSize());
	System.out.println("Dog two: " + two.getSize());
	one.bark();
	two.bark();
}
}