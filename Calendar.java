/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    static int year;		
	static int dayOfMonth = 1;   
	static int month = 1;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    int year = Integer.parseInt(args[0]);
        for(int i = 1900; i<year; i++){
			debugDaysCounter += isLeapYear(year) ? 366 : 365;
			if(month == 12 || dayOfMonth ==31 || i == year-1){
				break;
			}
		}

	 	while (true) {
			if(dayOfWeek == 1){
			System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			} else {
			System.out.println(dayOfMonth + "/" + month + "/" + year);	
			}	

	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		}
        }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (dayOfWeek == 7){
			dayOfWeek = 1;
		} else
		    dayOfWeek++;
		if(dayOfMonth == nDaysInMonth(month, year) && month != 12){
			 month ++;
			 dayOfMonth = 1;
			 }
	     else if(dayOfMonth == nDaysInMonth(month, year) && month == 12){
			year++;
			dayOfMonth = 1;
			month = 1;
		 } else
		    dayOfMonth++;
	 } 
		 
    // 确定闰年
	private static boolean isLeapYear(int year) {
	    if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 !=0)){
			return true;
		}
		 return false;
	}
	 
	// 指定月份天数
	private static int nDaysInMonth(int month, int year) {
		int days;
		if(month == 4 || month == 6 || month ==9 || month ==11)
		   days = 30;
		else if(month == 2){
			if(isLeapYear(year)){
				days = 29;
			} else 
			  days = 28;
		} else
		    days = 31;  
		return days;
	}

	}
