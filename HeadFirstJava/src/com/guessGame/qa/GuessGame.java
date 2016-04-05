package com.guessGame.qa;

public class GuessGame {
	Player p1; 	// ---> Game has three instance 
	Player p2; 	//       variable for three player 
	Player p3;	//        objects
	
	public void startGame() {
		p1 = new Player();  	// --> create three player objects and
		p2 = new Player();   	//    assign them to the three player
		p3 = new Player();   	//    instance variables
		
		int guessp1 = 0;     	// --> declare three variables to hold the
		int guessp2 = 0;     	//      three guesses the Players make
		int guessp3 = 0;   		//
		
		boolean p1isRight = false; 	// declare three variables to hold a true or
		boolean p2isRight = false;  // false based on the player’s answer
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10); 						 // make a ‘target’ number that the
		System.out.println("I'm thinking of a number between 0 and 10...");  //players have to guess
		
		while(true) {
			System.out.println("Number to guess is " + targetNumber);
			p1.guess();
			p2.guess();    		// --- > call each player’s guess() method
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);  	// get each player’s guess (the result of their
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);  	// guess() method running) by accessing the
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);  //number variable of each player

			
			if (guessp1 == targetNumber) { 	// check each player’s guess to see if it matches
				p1isRight = true;			// the target number. If a player is right,
			}
			if (guessp2 == targetNumber) { 	//then set that player’s variable to be true
				p2isRight = true;
			}
			if (guessp3 == targetNumber) { 	//(remember, we set it false by default)
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight) {    		// if player one OR player two OR player three is right... 
				System.out.println("We have a winner!");		// (the || operator means OR)
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break;                              			// game over, so break out of the loop
																// otherwise, stay in the loop and ask the player for another guess
			} else { 											// we must keep going because nobody got it right!
				System.out.println("Players will have to try again.");
			}	// end if/else
		}		// end loop
	}			// end method
}				// end class