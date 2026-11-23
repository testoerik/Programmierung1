/*
 * @author: Erik Hagmüller
 */

public class Fibonacci_Cached {
	
	/*
	 * Globale Variable fibCache.
	 */
	static long[] fibCache;
	
	public static void main(String[] args) {
		
		int n = In.readInt( "Bitte geben Sie eine Zahl ein: " );
		
		
		fibCache = new long[n + 1];
		
		System.out.println("Die Zahl an Position "+n+ " der Fibonacci-Folge ist: "+fib(n)+".");
		
	}

	static long fib(int n) {
		/*
		 * Überprüfe, ob Wert schon berechnet wurde.
		 * Schaue dazu in fibCache nach.
		 */
		if ( fibCache[n] != 0 ) {
			/*
			 * Gebe den Wert, der an Position n in fibCache steht, zurück.
			 */
			return (long)(fibCache[n]);
		}
		/*
		 * 
		 */
		else if ( n == 0) {
			fibCache[n] = 0;
			return (long)(fibCache[n]);
		}
		else if ( n == 1 ) {
			fibCache[n] = 1;
			return (long)(fibCache[n]);
		}
		else {
			fibCache[n] = fib(n - 2) + fib(n - 1);
			return (long)(fibCache[n]);
		}
	}
}
