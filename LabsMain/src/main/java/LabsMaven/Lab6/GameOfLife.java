////////////////////////////////////////////////////////////////////////////////////
//  C212
//   
//  Released:  2/21/20
//
//  Lab 6
//  @Author  Tony Dattolo, tdattolo
//  Last Edited:  2/27/2020
//
//
//  Directions: Implement assigned methods and testing as described in Lab6.pdf
//               
//////////////////////////////////////////////////////////////////////////////////

package LabsMaven.Lab6;

/**
 * Conway's Game of Life class implementation.
 */
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

	/**
	 * Computes the next iteration of conway's game of life on the GameOfLife instance
	 * @param generation the number of wanted generations
	 * @param freqPrint how often to print based on generations
	 */
	public void grow(int generation, int freqPrint) {
		
		boolean[][] deepCopyBoard = new boolean[NUMROW][NUMCOL];
		for (int i = 0; i < NUMROW; i++) {
			for (int j = 0; j < NUMCOL; j++) {
				deepCopyBoard[i][j] = this.board[i][j];
			}
		}
		
		int generationCounter = 0;
		
		// Continue to grow until the number of wanted generations is reached
		while (generationCounter < generation) {

			// Print board at the requested frequency of generations
			if (generationCounter % freqPrint == 0) {
				
				String boardPrinter = "";

				for (int i = 0; i < NUMROW; i++) {
					for (int j = 0; j < NUMCOL; j++) {
						if (deepCopyBoard[i][j] == true) {
							boardPrinter += "o" + " ";
						} else {
							boardPrinter += "+" + " ";
						}
					}
					boardPrinter += "\n";
				}
				System.out.println(boardPrinter);
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

					if (this.board[i][j] == true && (neighborCount == 0 || neighborCount == 1)) {
						deepCopyBoard[i][j] = false;
					} else if (this.board[i][j] == true && neighborCount == 2) {
						deepCopyBoard[i][j] = true;
					} else if (this.board[i][j] == true && neighborCount >= 4) {
						deepCopyBoard[i][j] = false;
					} else if (this.board[i][j] == false && neighborCount == 3) {
						deepCopyBoard[i][j] = true;
					} else {
						continue;
					}
				}
			}

			// Copy results of this iteration to board for use in next iteration
			for (int i = 0; i < NUMROW; i++) {
				for (int j = 0; j < NUMCOL; j++) {
					this.board[i][j] = deepCopyBoard[i][j];
				}
			}
			generationCounter++;
		}
	}

	/**
	 * Check the surrounding neighbors in the array as described in the book 7.6.3 page 338.
	 * Accounts for edge cases by catching index bounds exceptions.
	 * @return the number of neighbors
	 */
	private int checkNeighbor(int x, int y) {
		int checkCount = 0;
		for (int i = -1; i < 2; i++) {
			for (int j = -1; j < 2; j++) {
				if (i == 0 && j == 0) {
					continue;
				}
				try {
					if (this.board[x+i][y+j] == true) {
						checkCount++;
					}
				} catch (IndexOutOfBoundsException e) {
					continue;
				}
			
			}
		}
		// System.out.println("x: "+x+" y: "+y+" checkCount: "+checkCount); // for debugging
		return checkCount;
	}
}