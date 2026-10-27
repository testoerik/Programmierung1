
public class DateChecker {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int day = In.readInt("Bitte geben Sie eine ganze Zahl für den Tag ein: ");
        int month = In.readInt("Bitte geben Sie eine ganze Zahl für den Monat ein: ");
        int year = In.readInt("Bitte geben Sie eine ganze Zahl für das Jahr ein: ");
        
        
        // test isLeapYear method
        System.out.println( isLeapYear( year ) );
        
    }
    // (i) the method return true, if the year is a leap year and false otherwise.
    // (ii) the method gets an integer as input and return a boolean.
    // Die Methode isLeapYear kriegt eine Ganzzahl als Wert die vom Datentyp int ist.
    // Die Methode gibt einen Wahrheitswert (boolean), also wahr oder falsch zurück.
    // (iii) 
    static boolean isLeapYear(int year ) {
        if ( ( year % 400 ) == 0 ) {
            return true;
        } else if ( ( ( year % 4) == 0 ) && !( ( year % 100 ) == 0 ) ) {
            return true;
        } else {
            return true;
        }
    }

}
