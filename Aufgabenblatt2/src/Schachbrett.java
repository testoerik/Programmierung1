// Author: Erik Hagmüller

public class Schachbrett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char zeichen = In.readChar("Bitte geben Sie ein Zeichen ein: ");
		int breite = In.readInt("Bitte geben Sie die Breite von dem Feld ein: ");
		int laenge = In.readInt("Bitte geben Sie die Länge von dem Feld ein: ");

		boolean blackOrWhite = true;
		for (int i = 1; i <= 8; i++) {
			blackOrWhite = !blackOrWhite;
			for (int j = 1; j <= laenge; j++) {
				for (int k = 1; k <= 8; k++) {
					blackOrWhite = !blackOrWhite;
					for (int l = 1; l <= breite; l++) {
						if (blackOrWhite) {
							System.out.print(zeichen);
						} else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}

		}
	}
}