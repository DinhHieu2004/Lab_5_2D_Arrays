package Task2;

public class TicTacToeAdvanced {
	private final char EMPTY = ' ';
	private char[][] board;

	public TicTacToeAdvanced(char[][] board) {

		this.board = board;
	}

	public boolean checkRows() {
		for (int row = 0; row < board.length; row++) {
			char firstChar = board[row][0];
			boolean check = true;

			if (firstChar != EMPTY) {
				for (int col = 1; col < board.length; col++) {
					if (board[row][col] != firstChar) {
						check = false;
						break;
					}
				}
			}
			if(check) {
				if(board[row][0] =='X') {
			    	System.out.println("X WIN");
			    }else {
			    	System.out.println("O WIN");
			    }
				return true;
			}
		    
		}
		
		return false;
	}

	public boolean checkColumns() {
		for (int col = 0; col < board.length; col++) {
			char firstChar = board[0][col];
			boolean check = true;
			if (firstChar != EMPTY) {
				for (int row = 1; row < board.length; row++) {
					if (board[row][col] != firstChar) {
						check = false;
					}
				}
			}
			if(check) {
				if(board[0][col] =='X') {
			    	System.out.println("X WIN");
			    }else {
			    	System.out.println("O WIN");
			    }
				return true;
			}
		}
		return false;
	}
	public boolean checkDiagonals() {
		
		char topLeftChar = board[0][0];
		char topRightChar = board[0][board.length - 1];

		
		if (topLeftChar != EMPTY) {
			boolean check = true;
			for (int i = 1; i < board.length; i++) {
				if (topRightChar != board[i][i]) {
					check = false;
				}
				
			}
			if(check) {
				if (topLeftChar == 'X') {
					System.out.println("X WIN");
				} else {
					System.out.println("O WIN");
				}
				return true;
			}
		}
		if (topRightChar != EMPTY) {
			boolean check = true;
			for (int j = 1; j < board.length; j++) {
				if (topRightChar != board[j][board.length - 1 - j]) {
					check = false;
				}
			}
			if(check) {
				if (topRightChar == 'X') {
					System.out.println("X WIN");
				} else {
					System.out.println("O WIN");
				}
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		char[][] board = 
	    {{'O','X','X','O'}
		,{'X','X','O','X'},
		 {'O','O','O','X'}
		,{'O','X','O','O'}};
		TicTacToeAdvanced t = new TicTacToeAdvanced(board);
		System.out.println(t.checkDiagonals());
	}

}
