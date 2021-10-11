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
	
	
	public static boolean compareWithUndos(String[] inputsA, String[] inputsB) {
		
		
		// fake return value for now to make the compiler happy:
		return false;
	}
	
	public static void main(String[] args) {
		// Uncomment lines below for some initial tests
		//  of your code.

//		checkChainFormable(new Domino(1, 3), new Domino(2, 3), new Domino(1, 5));
		
//		String[] sudoku1 = {				
//			"1...",
//			".2..",
//			"...3",
//			"...."
//		};
//		SudokuBoard board1 = new SudokuBoard(sudoku1);
//		board1.display();
//		// This should find a solution:
//		board1.solve();
//		
//		String[] sudoku2 = {				
//				"1...",
//				".2..",
//				"...2",
//				"3..."
//			};
//		SudokuBoard board2 = new SudokuBoard(sudoku2);
//		board2.display();
//		// This should report the board is NOT solvable:
//		board2.solve();
		
//		String[] sequence1 = { "The", "cake", "is", "a", "live", "*UNDO*", "lie" };
//		String[] sequence2 = { "The", "pie", "*UNDO*", "cake", "is", "sweet", "*UNDO*", "a", "lie" };
//		// This should print true:
//		System.out.println(compareWithUndos(sequence1, sequence2));
//		
//		String[] sequence3 = { "I", "believe", "you", "have", "my", "stapler" };
//		String[] sequence4 = { "I", "believe", "youu", "*UNDO*", "you", "hvvv", "my", "stapler" };
//		// This should print false:
//		System.out.println(compareWithUndos(sequence3, sequence4));
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

