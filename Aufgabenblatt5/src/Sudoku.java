/*
 * 
 * @author Erik Hagmüller
 */
public class Sudoku {

	public static void main(String[] args) {
		// Erstellen eines leeren Sudoku-Gitters
		int[][] sudokuGrid = new int[9][9];

		// Fill the grid
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 1; k <= 9; k++) {
					if (tryNumber(sudokuGrid, i, j, k)) {
						break;
					}
				}
			}
		}
		showSudoku(sudokuGrid);
	}

	// (b) Methode zum Anzeigen des Sudoku-Gitters auf der Konsole
	public static void showSudoku(int[][] grid) {

		for (int row = 0; row < 9; row++) {
			// Horizontale Trennlinie vor jeder 3. Zeile
			if (row % 3 == 0) {
				System.out.println(" -----------------------");
			}
			for (int col = 0; col < 9; col++) {
				// Alle 3x3-Quadrate werden durch vertikale Linien getrennt
				if (col % 3 == 0) {
					System.out.print("| ");
				}
				// Jede Zahl wird als Punkt dargestellt, wenn sie 0 ist (leeres Feld)
				if (grid[row][col] == 0) {
					System.out.print(". ");
				} else {
					System.out.print(grid[row][col] + " ");
				}

			}
			System.out.println("|"); // Abschluss jeder Zeile
		}
		System.out.println(" ----------------------- "); // Untere Linie
	}

	// (c) Methode zum Eintragen eines Wertes in das Sudoku-Gitter
	public static void insert(int[][] grid, int row, int col, int num) {
		// Überprüfen, ob die Eingabeparameter gültig sind
		if (row < 0 || row >= 9 || col < 0 || col >= 9 || num < 1 || num > 9) {
			System.out.println("Ungültige Eingabe: Zeile, Spalte oder Zahl nicht gültig.");
		} else {
			// Zahl eintragen
			grid[row][col] = num;
		}
	}

	// Aufgabenblatt 5 (a)
	public static boolean conflictInRow(int[][] grid, int row, int col) {
		if ((row < 0 || row >= 9) || (col < 0) || (col >= 9) || (grid[row][col] == 0)) {
			return false;
		}

		int valInRow = grid[row][col];
		for (int i = 0; i < 9; i++) {
			if ((valInRow == grid[row][i]) && (i != col)) {
				return true;
			}
		}
		return false;
	}

	// Aufgabenblatt 5 (b)
	public static boolean conflictInColumn(int[][] grid, int row, int col) {

		if ((row < 0 || row >= 9) || (col < 0) || (col >= 9) || (grid[row][col] == 0)) {
			return false;
		}

		int valInCol = grid[row][col];
		for (int j = 0; j < 9; j++) {
			if ((valInCol == grid[j][col]) && (j != row)) {
				return true;
			}
		}
		return false;
	}

	// Aufgabe 5 (c)
	public static boolean conflictInSquare(int[][] grid, int row, int col) {

		if ((row < 0 || row >= 9) || (col < 0) || (col >= 9) || (grid[row][col] == 0)) {
			return false;
		}

		int startRow = row - (row % 3);

		int startCol = col - (col % 3);

		for (int i = startRow; i < startRow + 3; i++) {

			for (int j = startCol; j < startCol + 3; j++) {

				if ((grid[i][j] == grid[row][col]) && ((i != row) || (j != col))) {
					return true;
				}
			}
		}
		return false;
	}

	// Aufgabe 5 (d)
	public static boolean isConflict(int[][] grid, int row, int col) {

		if ((row < 0 || row >= 9) || (col < 0) || (col >= 9) || (grid[row][col] == 0)) {
			return false;
		}

		if (conflictInRow(grid, row, col) || (conflictInColumn(grid, row, col)) || (conflictInSquare(grid, row, col))) {
			return true;
		}
		return false;
	}

	// Aufgabe 5 (e)
	public static boolean tryNumber(int[][] grid, int row, int col, int zahl) {
		if (grid[row][col] == 0) {
			grid[row][col] = zahl;
			if (isConflict(grid, row, col)) {
				grid[row][col] = 0;
				return false;
			}
		}
		return true;
	}
}