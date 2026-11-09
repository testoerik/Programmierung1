// Author: Erik Hagmüller

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = In.readInt("Bitte geben Sie eine Zahl n ein: ");

		double kontoStand = 100;

		int summeZahlen = 0;
		int summeKubikzahlen = 0;

		for (int i = 0; i <= n; i++) {
			if ((i % 2) == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		for (int i = n; i >= 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			kontoStand += (kontoStand * 0.025);
		}
		System.out.print("Nach " + n + " Jahren beträgt ihr Kontostand " + kontoStand + " Euro.");
		System.out.println();
		for (int i = 0; i <= n; i++) {
			summeZahlen += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("Aufsummiert ergeben die Zahlen: " + summeZahlen);
		System.out.println();
		for (int i = 0; i <= n; i++) {
			int kubikZahl = i * i * i;
			summeKubikzahlen += kubikZahl;
			System.out.print(kubikZahl + " ");
		}
		System.out.println();
		System.out.print("Aufsummiert ergeben die Kubikzahlen: " + summeKubikzahlen);
	}

}