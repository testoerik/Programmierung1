/*
 * @author: Erik Hagmüller
 */
public class Date {

	private int day;
	private int month;
	private int year;

	// Default-Konstruktor
	public Date() {
		this.day = 01;
		this.month = 01;
		this.year = 2024;
	}

	public Date(int day, int month, int year) {

		this.day = day;

		this.month = month;

		this.year = year;
	}

	// copy-constructor
	public Date(Date other) {

		this.day = other.day;

		this.month = other.month;

		this.year = other.year;
	}

	// method isLeapYear(year) which checks, if the given year is a leap year or not.
	boolean isLeapYear(int year) {
		if ((year % 4) == 0) {
			if ((year % 100) == 0) {
				if ((year % 400) == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}
	// method isValidDay(), which checks, if the given day is correct.
	boolean isValidDay(int day, int year, int month) {
		// in order to check if the day is correct, we use switch-case.
		switch (month) {
		case 2:
			if (isLeapYear(year)) {
				return ((day >= 1) || (day <= 29));
			} else {
				return ((day >= 1) || (day <= 28));
			}
		case 1, 3, 5, 7, 8, 10, 12:
			return ((day >= 1) || (day <= 31));
		case 4, 6, 9, 11:
			return ((day >= 1) || (day <= 30));
		}
		return false;
		
	}

	// TO-DO
	boolean isValidDate(int day, int year, int month) {
		// check the day using isValidDay()-method.
		if (isValidDay(day, year, month)) {
			
		}
		
		// second, we have to check if the year is a leap year.
		// in order to do that, we use the isLeapYear()-method.
		if (isLeapYear(year)) {
			// Now, we know that the given year is a leap year.
			// Now, we check if month is February and if so, if the day is in the
			// correct range.
			if (month == 2) {
				if ((day < 1) || (day > 29)) {
					return false;
				}
			}
		}

		// check the day.
		// check if the day is in February.
		else if (month == 2) {

		}

	}

}
