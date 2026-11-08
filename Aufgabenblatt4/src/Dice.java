import java.util.Arrays;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Test rollDie method
		System.out.println(rollDie());
		System.out.println(rollDie());
		System.out.println(rollDie());
		System.out.println(rollDie());
		System.out.println(rollDie());

		System.out.println(Arrays.toString(rollDice(10)));

		System.out.println(Arrays.toString(wuerfelnBisZumPasch(5)));
	}

	// The method rollDie returns an integer between
	public static int rollDie() {
		return (int) (((Math.random()) * 6) + 1);
	}

	public static int[] rollDice(int n) {
		if (n <= 0) {
			int[] emptArr = { 0 };
			return emptArr;
		} else {
			int[] res = new int[n];
			for (int i = 0; i < n; i++) {
				res[i] = rollDie();
			}
			return res;
		}
	}

	public static int[] wuerfelnBisZumPasch(int n) {
		int[] zahlen = new int[n];
		do {
			zahlen = rollDice(n);
		} while (!(allEqual(zahlen)));
		return zahlen;
	}

	public static boolean allEqual(int[] zahlen) {
		int firstNum = zahlen[0];
		for (int i = 1; i < zahlen.length; i++) {
			if (firstNum != zahlen[i]) {
				return false;
			}
		}
		return true;
	}
}
