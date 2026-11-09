
public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] emptArr = new int[17];

		//
		for (int i : emptArr) {
			System.out.print(i + " ");
		}

		int j = 0;
		for (int i = (emptArr.length) - 1; i >= 0; i--) {
			if (((i + 1) % 2) == 0) {
				emptArr[j] = (i + 1);
				j++;
			} else {
				emptArr[j] = 0;
				j++;
			}
		}
		System.out.println();
		for (int i : emptArr) {
			System.out.print(i + " ");
		}
		
		for (int i = 0; i < emptArr.length; i++ ) {
			if ( emptArr[i] == 0 ) {
				emptArr[i] = (int)( Math.random() * 20 ) + 1;
			}
		}
		System.out.println();
		for ( int i : emptArr ) {
			System.out.print(i + " ");
		}
		
		int firstVal = emptArr[0];
		for ( int i = 0; i < emptArr.length; i++) {
			emptArr[i] = emptArr[( i + 1 ) % emptArr.length];
		}
		emptArr[( emptArr.length - 1 )] = firstVal;
		
		System.out.println();
		for ( int i : emptArr ) {
			System.out.print(i + " ");
		}
		
		int maxVal = emptArr[0];
		int indexOfMaxVal = 0;
		for ( int i = 1; i < emptArr.length; i++ ) {
			if ( emptArr[i] > maxVal) {
				maxVal = emptArr[i];
				indexOfMaxVal = i;
			}
		}
		System.out.println();
		System.out.println("Die grösste Zahl befindet sich an Position "+indexOfMaxVal+" und hat den Wert "+maxVal+".");
		
	}	

}
