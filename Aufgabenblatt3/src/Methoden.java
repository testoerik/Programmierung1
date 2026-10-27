
public class Methoden {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        // test calculateCubicNumber.
        System.out.println( calculateCubicNumber( 3 ) );
        System.out.println( calculateCubicNumber( 10 ));
        System.out.println( calculateCubicNumber( 42 ) );
        
        // test sumOfCubes.
        System.out.print(sumOfCubes( 7 ) );
        
        // test squareOfSum.
        System.out.println( squareOfSum( 7 ) );
        
        for ( int i = 99; i <= 111; i++) {
            System.out.println( quersumme( i ) );
        }
    }
    
    static long calculateCubicNumber( long n ) {
        long n3 = (n * n * n);
        return n3;
    }
    
    static long sumOfCubes( long n ) {
        long sumOfCubes = 0;
        for (int i = 1; i <= n; i++) {
            sumOfCubes += calculateCubicNumber(i);
        }
        return sumOfCubes;
    }
    
    static long squareOfSum( int n ) {
        long sumOfn = 0;
        for ( int i = 1; i <= n; i++ ) {
            sumOfn += i;
        }
        sumOfn *= sumOfn;
        return sumOfn;
    }
    
    public static long quersumme( int n ) {
        long querSumme = 0;
        while ( n != 0 ) {
            querSumme += ( n % 10 );
            n /= 10;
        }
        return querSumme;
    }
    
}
