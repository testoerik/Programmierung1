// Author: Erik Hagmüller

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n;
		int zaehler = 0;
		do {
			n = In.readLong("Bitte geben Sie eine Zahl größer als 1 ein: ");
		} while (n <= 1);
		System.out.println(n);
		while (n > 1) {
			zaehler += 1;
			if (zaehler == 500) {
				System.out.print("Die Folge ist länger als 500. Abbruch.");
				break;
			} else {
				if ((n % 2) == 0) {
					n /= 2;
					System.out.println(n);
					System.out.println("Zähler: " + zaehler);
				} else {
					n = (3 * n) + 1;
					System.out.println(n);
					System.out.println("Zähler: " + zaehler);

				}
			}
		}
	}

}
