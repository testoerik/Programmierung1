/*
 * @author: Erik Hagmüller
 * */
public class BitOperations {
	public static void main(String[] args) {
		printBit(2048);
		printBit(2048, 11);
		setBit(2048, 11);
		System.out.println(unsetBit(6144, 11));
		dreimalXOR(4, 5);
	}

	// (a)
	static void printBit(int number) {
		// 2048 ist gleich der Binärzahl, welche an Position 11 eine 1 hat und sonst nur
		// 0.
		int bitMask = 2048;
		/*
		 * Mit der UND-Verknüpfung haben wir zwei Möglichkeiten: 1) res ist gleich
		 * bitMask: das heißt number hat an Position 11 eine 1. 2) res ist nicht gleich
		 * bitMask: das heißt number hat an Position 11 keine 1.
		 */
		int res = number & bitMask;
		System.out.println( res == bitMask ? 1 : 0);
	}

	// (b)
	static void printBit(int number, int k) {
		// Wir überprüfen, ob k eine gültige Position ist, dazu muss k im Inter [0, 31]
		// sein.
		if ((k < 0) || (k > 31)) {
			System.out.println(k + " hat einen ungültigen Wert.");
		} else {
			/*
			 * Die bitMask wird gleich 1 gesetzt. Das bedeutet an Position 1 steht eine 1
			 * und sonst nur 0. Anschließend wird Position 1, an der eine 1 steht, um
			 * k-Positonen nach links verschoben (mit Hilfe der Bit-Shift Operation)
			 */
			int bitMask = 1;
			bitMask = bitMask << k;
			/*
			 * number wird wieder mit bitMask UND-verknüpft. Dann genau das gleiche Prinzip,
			 * wie vorhin: Sollte number an Position k eine 1 stehen haben, so hat res den
			 * gleichen Wert wie bitMask.
			 */
			int res = bitMask & number;
			if (res == bitMask) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}
	}

	// (c)
	static int setBit(int number, int k) {
		int tmpNum = 1;
		tmpNum = tmpNum << k;

		int res = number | tmpNum;

		return res;
	}

	// (d)
	static int unsetBit(int number, int k) {
		int tmpNum = 1;

		// Die 1 wird um k-Positionen nach links verschoben.
		tmpNum = tmpNum << k;

		// Anschließend wird die 1 an Position k zu 0 und der Rest zu 1.
		tmpNum = ~tmpNum;

		// Nun wird die UND-Verknüpfung wieder angewendet. So wird das Bit an Position k
		// geflippt, gleichzeitig werden die anderen Bits nicht geändert.
		int res = number & tmpNum;

		return res;
	}	
// (d) zweite Möglichket von unsetBit
	static int unsetBit2( int number, int k ) {
		int bitMask = 1 << k;
		
		// 0 ist das neutrale Element der ODER-Verknüpfung, 0 ist das inverse Element der UND-Verknüpfung
		// 1 ist das neutrale Element der UND-Verknüpfung
		return number & ~bitMask;
	}


	/*
	 * (e) Vertausche die Werte von x und y.
	 * 
	 */
	static void dreimalXOR(int x, int y) {
		System.out.println("x=" + x + " y=" + y);
		// Binärdarstellung von 4 (x): 0100;
		// Binärdarstellung von 5 (y): 0101;
		x = x ^ y; // erstes Mal x XOR y
		// x = (0100) (0101) = (0001) = 2
		y = x ^ y; // zweites Mal x XOR y
		// y = (0001) (0101) = (0100) = 4
		x = x ^ y; // drittes Mal x XOR y
		// x = (0001) (0100) = (01001) = 5
		System.out.println("x=" + x + " y=" + y);
	}
}
