/**
 * Musterlösung zu Blatt 4, Sudoku
 * 
 * @author Tobias Lauer
 */
public class Sudoku {

	public static void main(String[] args) {
		// Erstellen eines leeren Sudoku-Gitters
		int[][] sudokuGrid = new int[9][9];

		// (b) Aufrufen der Methode showSudoku zur Anzeige des leeren Sudokus
		showSudoku(sudokuGrid);

		// (c) Einfügen mit Methode insert - 20 Felder
		insert(sudokuGrid, 0, 0, 9); // Zeile 0, Spalte 0, Zahl 9
		insert(sudokuGrid, 0, 1, 9); // Zeile 0, Spalte 1, Zahl 9
		// conflictInRow should return true.
		System.out.println(conflictInRow(sudokuGrid, 0, 0));
		
		// weitere Tests
		insert(sudokuGrid, 1, 0, 2);
		insert(sudokuGrid, 1, 1, 2);
		System.out.println(conflictInRow(sudokuGrid, 1, 0));
		
		insert(sudokuGrid, 7, 2, 3);
		insert(sudokuGrid, 8, 2, 3);
		System.out.println(conflictInColumn(sudokuGrid, 1, 0));
		// (b)Sudoku mit den eingefügten Zahlen
		System.out.println("\nSudoku nach Befüllung:");
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
		// check if row and column are valid values
		if ((row < 0) || (col < 0)) {
			return false;
		}

		int valInRow = grid[row][col];
		for (int i = 0; i < 9; i++) {
			if ((valInRow == grid[row][i]) && (i != row)) {
				return true;
			}
		}
		return false;
	}

	// Aufgabenblatt 5 (b)
	public static boolean conflictInColumn(int[][] grid, int row, int col) {
		// check if row and column are valid values
		if ((row < 0) || (col < 0)) {
			return false;
		}

		int valInCol = grid[row][col];
		for (int j = 0; j < 9; j++) {
			if ((valInCol == grid[row][j]) && (valInCol != col)) {
				return true;
			}
		}
		return false;
	}

}