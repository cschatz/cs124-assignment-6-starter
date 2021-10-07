package edu.mills.cs124.assignment6;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment6 {
	
	private static boolean chainHelper(ArrayList<Domino> sofar, ArrayList<Domino> remain) {
	
		// fake return value - you should replace this!
		return false;
	}
	
	public static void chainFormable(ArrayList<Domino> dominos) {
		ArrayList<Domino> chain = new ArrayList<Domino>();
		if (chainHelper(chain, dominos)) {
			System.out.println("Yes, those can form a chain:");
			chain.forEach((Domino d) -> System.out.print(d));
			System.out.println();
		} else {
			System.out.println("Those CANNOT form a chain.");
		}
	}
	
	
	public static void main(String[] args) {
		// Uncomment lines below for some initial tests
		//  of your code.

		// checkChainFormable(new Domino(1, 3), new Domino(2, 3), new Domino(1, 5));
	}
	
	// =======================================================
	//   Methods below here are already complete. 
	//   You should not change them.
	// =======================================================
	
	
	public static void checkChainFormable(Domino... originalDominos) {
		ArrayList<Domino> list = new ArrayList<Domino>(Arrays.asList(originalDominos));
		chainFormable(list);
	}
	
	
	
}

