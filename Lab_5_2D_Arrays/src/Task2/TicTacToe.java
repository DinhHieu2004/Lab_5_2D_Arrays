package Task2;

public class TicTacToe {

	private static final char EMPTY = ' ';
	private char[][] board;

	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */

	public TicTacToe(char[][] board) {

		this.board = board;
	}

	public boolean checkRows() {
		for (int row = 0; row < 3; row++) {
			if (board[row][0] != EMPTY 
				&& board[row][0] == board[row][1] 
				&& board[row][1] == board[row][2]) {
				if (board[row][0] == 'X') {
					System.out.println("X WIN");
				} else {
					System.out.println("O WIN");
				}
				return true;
			}
		}
		return false;
	}

	/*
	 * This method checks all columns and returns true if any of them are marked
	 * with all of a single player's. Otherwise, returns false.
	 */
	public boolean checkColumns() {
		for (int col = 0; col < 3; col++) {
			if (board[0][col] != EMPTY
				&& board[0][col] == board[1][col]
				&& board[1][col] == board[2][col]) {
				if (board[0][col] == 'X') {
					System.out.println("X WIN");
				} else {
					System.out.println("O WIN");
				}
				return true;
			}
		}
		return false;
	}

	/*
	 * This method checks both diagonals and returns true if any of them are marked
	 * with all of a single player's markers. Otherwise, returns false.
	 */
	public boolean checkDiagonals() {
		if (board[0][0] != EMPTY 
			&& board[0][0] == board[1][1] 
			&& board[1][1] == board[2][2]) {
			if (board[1][1] == 'X') {
				System.out.println("X WIN");
			} else {
				System.out.println("O WIN");
			}
			return true; 
		}
		if (board[0][2] != EMPTY 
			&& board[0][2] == board[1][1]
			&& board[1][1] == board[2][0]) {
			if (board[1][1] == 'X') {
				System.out.println("X WIN");
			} else {
				System.out.println("O WIN");
			}
			return true;
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'O' },
				           { 'X', 'X', 'O' },
				           { 'O', 'O', 'X' } };
		TicTacToe r = new TicTacToe(board);
		r.checkDiagonals();
	}

}
