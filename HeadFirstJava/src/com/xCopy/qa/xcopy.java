package com.xCopy.qa;

public class xcopy {
public static void main (String [] args) {
	int orig = 42;
	xcopy x = new xcopy();
	int y = x.go(orig);
	System.out.println(orig +" " + y);;
}
int go(int arg){
	arg = arg* 2;
	return arg;
}
}
