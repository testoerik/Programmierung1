/*
 * @author: Erik Hagmüller
 */


public class Handshake {
	public static void main( String[] args ) {
		int num = In.readInt( "Bitte geben Sie eine Zahl ein: ");
		System.out.println("Insgesamt wurden "+numberOfHandshakes(num)+"-Mal die Hände geschüttelt.");
	}
	static int numberOfHandshakes(int n) {
		/* Was soll für n = 1 zurückgegeben werden ?
		 * 0, da ein Teilnehmer sich nicht selber die Hand schüttelt.
		 */
		if ( n <= 1 ) {
			return 0;
		}
		else {
			return (n - 1) + numberOfHandshakes( n - 1 );
		}
	}
}
