// author: Erik Hagmüller
public class DateChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = In.readInt("Bitte geben Sie eine ganze Zahl für den Tag ein: ");

		int month = In.readInt("Bitte geben Sie eine ganze Zahl für den Monat ein: ");

		int year = In.readInt("Bitte geben Sie eine ganze Zahl für das Jahr ein: ");

		String[] months = { "Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September",
				"Oktober", "November", "Dezember" };

		// test isLeapYear method
		if (isLeapYear(year)) {
			System.out.println("Bei dem Jahr " + year + " handelt es sich um ein Schaltjahr!");
		} else {
			System.out.println("Bei dem Jahr " + year + " handelt es sich um kein Schaltjahr!");
		}

		// test isValidDate.
		if (isValidDate(day, month, year)) {
			System.out.println("Das Datum " + day + "." + month + "." + year + " ist ein gültiges Datum.");
			// test numberOfDays
			System.out.println("Der Monat " + months[month - 1] + " hat im Jahr " + year + " "
					+ numberOfDays(month, year) + " Tage.");
		} else {
			System.out.println("Das Datum " + day + "." + month + "." + year + " ist kein gültiges Datum.");
		}

	}

	// (i) the method returns true if the year is a leap year and false otherwise.
	// (ii) the method gets an integer (year) as input and returns a boolean.
	// (iii)
	// (iv)
	static boolean isLeapYear(int year) {
		if ((year % 400) == 0) {
			return true;
		} else if (((year % 4) == 0) && !((year % 100) == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// (i) the method returns the number of days.
	// (ii) the method gets two integers as input and returns an integer.
	// (iii)
	// (iv)
	static int numberOfDays(int month, int year) {

		switch (month) {
		case 2:
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		case 1:
			return 31;
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		}
		return 0;
	}

	// (i) the method isValidDate returns true if it is a valid date, false
	// otherwise
	// (ii) the methods gets three integers as input: day, month, year and returns a
	// boolean.
	// (iii)
	// (iv)
	static boolean isValidDate(int day, int month, int year) {

		// check if year is valid
		if (year < 0) {
			return false;
		} else if ((month < 1) || (month > 12)) {
			return false;
		} else if ((day < 1) || (day > numberOfDays(month, year))) {
			return false;
		}
		return true;
	}

}
