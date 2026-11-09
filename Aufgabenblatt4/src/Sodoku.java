
public class Sodoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sodoku grid.
		int[][] grid = new int[9][9];

		// test sodoku grid.
		for (int col = 0; col < 9; col++) {
			System.out.println();
			for (int row = 0; row < 9; row++) {
				System.out.print(grid[col][row]);
			}
		}
		System.out.println();
		showSudoku(grid);
	}

	public static void showSudoku(int[][] grid) {

		for (int i = 0; i < 3; i++) {
			System.out.print("-------------");
			for (int j = 0; j < 3; j++) {
				System.out.println();
				// draw rectangle
				for (int k = 0; k < 3; k++) {
					System.out.print("|");

					// draw points
					for (int l = 0; l < 3; l++) {
						System.out.print(".");
					}
				}
				System.out.print("|");
			}
			System.out.println();
		}
		System.out.print("-------------");
	}

}
