//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String [] args){
		
	

	// 1. Make a main method that includes all the steps below….
		
		
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random ran = new Random();
		int r = ran.nextInt(4);
	// 3. Print out this variable
		System.out.println(r);
	// 4. Get the user to enter a question for the 8 ball
		String hi = JOptionPane.showInputDialog(null, "Enter a random number.");
	// 5. If the random number is 0
		if(hi.equals("0")) {
			System.out.println("Yes");
		}
	// -- tell the user "Yes"

	// 6. If the random number is 1
		if(hi.equals("1")) {
			System.out.println("No");
		}
	// -- tell the user "No"

	// 7. If the random number is 2
		if(hi.equals("2")){
			System.out.println("Maybe you should ask Google?");
			
		}

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
		if(hi.equals("3")) {
			System.out.println("I don't know. Why are you wasting your time?");
		}
	// -- write your own answer

}
}