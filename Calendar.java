/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
     static int year = 1900;		
	static int dayOfMonth = 1;   
	static int month = 1;
	static int dayOfWeek = 2;   
	static int nDaysInMonth = 31; 
	
	public static void main(String args[]) {
	    int yearA = Integer.parseInt(args[0]);
        while (year <= yearA ){
			advance();
	 	   if (year == yearA) {
			   if(dayOfWeek == 1){
			          System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
			   } else {
			          System.out.println(dayOfMonth + "/" + month + "/" + year);	
			}	
	 		}
		}
        }
	
	 private static void advance() {
		if (dayOfWeek == 7){
			dayOfWeek = 1;
		} else
		    dayOfWeek++;
		if(dayOfMonth > nDaysInMonth(month, year)){
			if(month < 12){
			 month ++;
			 dayOfMonth = 1;
			} else{
			year++;
			dayOfMonth = 1;
			month = 1;
			}
		 } else
		 dayOfMonth++;
	 } 
		 
	private static boolean isLeapYear(int year) {
	    if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 !=0)){
			return true;
		} else
		 return false;
	}
	 
	private static int nDaysInMonth(int month, int year) {
		int nDaysInMonth;
		if(month == 4 || month == 6 || month ==9 || month ==11)
		   nDaysInMonth = 30;
		else if(month == 2){
			if(isLeapYear(year)){
				nDaysInMonth = 29;
			} else 
			  nDaysInMonth = 28;
		} else
		    nDaysInMonth = 31;  
		return nDaysInMonth;
	}

	}
