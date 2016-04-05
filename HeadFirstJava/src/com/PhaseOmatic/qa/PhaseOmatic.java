package com.PhaseOmatic.qa;
public class PhaseOmatic {
public static void main (String[] args) {
	
//Make three sets of word to choose from. add your own!
	
	String [] wordListOne = {"24/7", "Multi-Tier", "30,000",
			"B-to-B", "winwin", "Front-end", "web-based", 
			"pervasive", "smart", "six-Sigma", "criticapath",
			"dynamic"};
	String[] wordListTwo = { "empowered", "sticky",
			"value-added", "oriented", "centric", "distributed",
			"clustred", "branded", "outside-the-box", "positioned",
			"networked", "focused", "leveraged", "aligned", 
			"targeted", "shared", "cooperative", "accelerated"};
	String[] wordListThree = { "process", "tipping-point",
			"solution", "archetecture", "core competency", "strategy",
			"mindshare", "portal", "space", "vision", "paradigm", "mission"};
	
// Find out how many words in the list	
	
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	
// Generates Three random numbers
	
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);

// Now Build phase	
	
	String phrase = wordListOne [rand1] + " " + wordListTwo [rand2] + " " + wordListThree[rand3];

// Print phase
	
	System.out.println("What we need is a " + phrase);
	
	}
}