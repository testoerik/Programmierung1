
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
		
		for (int i : emptArr ) {
			System.out.println( i );
			if ( emptArr[i] == 0 ) {
				emptArr[i] = (int)( ( Math.random() * 20 ) + 1);
			}
		}
		
	}

}
