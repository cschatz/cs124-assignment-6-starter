package edu.mills.cs124.assignment6;

public class SudokuBoard {
	
	private char[][] grid;
	
	// Constructor
	SudokuBoard(String[] rows) {
		grid = makeArray(rows);
	}
	
	public void solve() {
		System.out.println();
		if (solveHelper(0, 0)) {
			System.out.println("Board solved! Here is the solution:");
			display();
		} else {
			System.out.println("This board cannot be solved.");
		}
		System.out.println();
	}
	
	private boolean solveHelper(int row, int col) {
		
		
		// Currently just returning false no matter what
		return false;
	}
	
	public void display()
	{
		// This method assumes that grid is 4x4 -- that is,
		// that it contains 4 strings each of length 4;

		final String bar = " -- -- ";
		final String margin = "    ";
		for (int r = 0; r < 4; r++)
		{
			if ((r%2) == 0)
				System.out.print(margin + bar + "\n");
			System.out.print(margin);
			for (int c = 0; c < 4; c++)
			{
				if (c%2 == 0)
					System.out.print("|");
				System.out.print(grid[r][c]);
			}
			System.out.print("|\n");
		}
		System.out.print(margin + bar + "\n");
	}
	
	
	
	
	/*
	 * The methods below here are private helper functions
	 * used by the public functions above.
	 * You should not change them, and don't need to understand them.
	 */
	
	private static char[][] makeArray(String[] rows) {
		int numRows = rows.length;
		int numCols = rows[0].length();
		char[][] arr = new char[numRows][numCols];
		for (int r = 0; r < numRows; r++) {
			for (int c = 0; c < numCols; c++) {
				arr[r][c] = rows[r].charAt(c);
			}
		}
		return arr;
	}
	
}
