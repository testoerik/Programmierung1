/*
 * @author: Erik Hagmüller
 */
public class SudokuTest {

	public static void main(String[] args) {

		/*
		 * Wir testen als erstes die isEmpty()-Methode
		 */

		SudokuField sudokuField1 = new SudokuField();
		System.out.println(sudokuField1.isEmpty()); // Gerade wurde eine Instanz von der Klasse SudokuField erstellt,
													// daher ist das Feld leer und isEmpty() gibt true zurück.
		sudokuField1.setValue(10); // Setze das Feld auf 10
		System.out.println(sudokuField1.isEmpty()); // Da das Feld auf 10 gesetzt wurde ist es nicht mehr leer und
													// isEmpty() dementsprechend false.
		sudokuField1.clear(); // Das Feld wurde auf seinen Startzustand zurückgesetzt.
		System.out.println(sudokuField1.isEmpty()); // isEmpty() muss daher zurück geben.

		SudokuField sudokuField2 = new SudokuField(10); // Erstelle eine neue Instanz (sudokuField2) von der Klasse
														// SudokuField und setze die Zahl auf 10.
		System.out.println(sudokuField2.isEmpty()); // isEmpty() muss false zurückgeben

		/*
		 * Wir testen als zweites die isFixed()-Methode
		 */
		System.out.println(sudokuField1.isFixed()); // Falsch, da das Feld leer ist, also keine feste Zahl eingetragen
													// hat.

		System.out.println(sudokuField2.isFixed()); // Wahr, da das Feld nicht leer ist.

		/*
		 * Wir testen als letztes die setValue()-Methode.
		 */
		sudokuField1.setValue(12); // Bei der Instanz sudokuField1 sollten wir die eingetragene Zahl problemlos
									// verändern können.
		System.out.println(sudokuField1.getValue());
		sudokuField1.setValue(15);
		System.out.println(sudokuField1.getValue());

		sudokuField2.setValue(22); // Bei der Instanz sudokuField2 sollten wir die eingetragene Zahl nicht
									// verändern können, da diese Instanz nicht mit dem Default-Konstruktor erzeugt
									// wurde.
		System.out.println(sudokuField2.getValue());

	}

}
