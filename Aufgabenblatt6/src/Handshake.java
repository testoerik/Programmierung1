/*
 * @author: Erik Hagmüller
 */
public class Handshake {
	static int numberOfHandshakes(int n) {
		/* Was soll für n = 1 zurückgegeben werden ?
		 * 0, da ein Teilnehmer sich nicht selber die Hand schüttelt.
		 */
		if ( n == 1 ) {
			return 0;
		} else if ( n == 2 ) {
			return 1;
		}
		else {
			return numberOfHandshakes( n - 1 ) + 1;
		}
	}
}
