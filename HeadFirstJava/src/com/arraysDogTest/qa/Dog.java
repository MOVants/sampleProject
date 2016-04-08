package com.arraysDogTest.qa;

public class Dog {
	String name;
	public static void main(String[] args){
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bat";
	
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = new Dog();

		myDogs[0].name = "Macy";
		myDogs[1].name = "altaire";
		myDogs[1].name = "altair";

		System.out.print("last dog name is ");
		System .out.println(myDogs[2].name);

		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
}
	public void bark(){

		System.out.println(name + " says altaiR!");
		System.out.println(name + " says Ruff!");
		System.out.println(name + " says altaiRe!");
		System.out.println(name + " s444ays Ruff!");
		System.out.println(name + " says LALA1222");
	}
		public void eat(){
			
		}
		public void chase () { 		
		}
}
