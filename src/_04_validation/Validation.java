//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		String hi = JOptionPane.showInputDialog(null,"Hi. Please input a number from 0-4.");
		if(hi.equals("2")) {
			System.out.println("You are cool.");
			
			
		}
		if(hi.equals("1")) {
			System.out.println("You are amazing.");
		}
		if(hi.equals("3")) {
			System.out.println("You are remarkable.");
		}
		if(hi.equals("0")) {
			System.out.println("You are very smart.");
		}
		if(hi.contentEquals("4")) {
			System.out.println("You are very intriguing.");
		}

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
