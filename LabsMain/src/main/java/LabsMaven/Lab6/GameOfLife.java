////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/21/20
//
//  Lab 6
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/21/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab6.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab6;

public class GameOfLife {

	private boolean[][] board;
	private final int NUMROW;
	private final int NUMCOL;

	/**
	 * Constructor method for GameOfLife class. Initializes rows, cols, and deep copy of init board
	 * @param initialBoard the board passed to GameOfLife
	 */
	public GameOfLife (boolean[][] initialBoard) {
		//initiate NUMROW and NUMCOL at here;
		this.NUMROW = initialBoard.length;
		this.NUMCOL = initialBoard[0].length;

		boolean[][] deepCopyInitialBoard = new boolean[NUMROW][NUMCOL];
		for (int i = 0; i < NUMROW; i++) {
			for (int j = 0; j < NUMCOL; j++) {
				deepCopyInitialBoard[i][j] = initialBoard[i][j];
			}
		}

		this.board = deepCopyInitialBoard;
	}
	
	/**
	 * Prints out current state of the board with O for unoccupied, + for occupied.
	 * @return the current board state
	 */
	@Override
	public String toString() {
		String boardPrinter = "";

		for (int i = 0; i < NUMROW; i++) {
			for (int j = 0; j < NUMCOL; j++) {
				if (board[i][j] == true) {
					boardPrinter += "o" + " ";
				} else {
					boardPrinter += "+" + " ";
				}
			}
			boardPrinter += "\n";
		}
		return boardPrinter;

	}

	public void grow(int generation, int freqPrint) {
		int generationCounter = 0;
		
		// Continue to grow until the number of wanted generations is reached
		while (generationCounter < generation) {

			// Print board at the requested frequency of generations
			if (generationCounter % freqPrint == 0) {
				this.board.toString();
				System.out.println("=================");
			}

			// Check game conditions regardling neighbors and behavior of space
			// if there are 0,1 or > 3 neighbors, board space dies (set to false)
			// if there are 2 neighbors and space is true, remains true
			// if there are 3 neighbors, the block becomes true
			int neighborCount;
			for (int i = 0; i < NUMROW; i++) {
				for (int j = 0; j < NUMCOL; j++) {
					neighborCount = checkNeighbor(i, j);

					if (neighborCount == 3) {
						board[i][j] = true;
					} else if (neighborCount == 2 && board[i][j] == true) {
						continue;
					} else if (neighborCount == 1 || neighborCount == 0 || neighborCount > 3) {
						board[i][j] = false;
					}
				}
			}
			generationCounter++;
		}
	}

	/**
	 * Check the surrounding neighbors in the array as described in the book 7.6.3 page 338
	 * @return the number of neighbors
	 */
	private int checkNeighbor(int x, int y) {
		int checkCount = 0;
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				try {
					if (board[x+i][y+j] == true) {
						checkCount++;
					}
				} catch (IndexOutOfBoundsException e) {
					continue;
				}
			}
		}
		return checkCount;
	}
}