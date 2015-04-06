public class Date {
	private int month, day, year ;

	Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}
 
	public boolean equals(Date date) {
   return (this.month == date.month) && (this.day == date.day) && (this.year == date.year);
	}
	
 }
