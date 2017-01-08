package hyh;
import java.text.DateFormatSymbols;
import java.util.*;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calender = new GregorianCalendar();
		int today = calender.get(Calendar.DAY_OF_MONTH);
		int month = calender.get(Calendar.MONTH);
		
		calender.set(Calendar.DAY_OF_MONTH,1);
		int weekday = calender.get(Calendar.DAY_OF_WEEK);
		
		int FirstdayOFWeek = calender.getFirstDayOfWeek();
		int count = 0;
		while(weekday != FirstdayOFWeek){
			count++;
			calender.add(Calendar.DAY_OF_MONTH, -1);
			weekday = calender.get(Calendar.DAY_OF_WEEK);
		}
		
		String[] weekdaysNames = new DateFormatSymbols().getShortWeekdays();
		System.out.printf("%4s",weekdaysNames[weekday]);
		calender.add(Calendar.DAY_OF_MONTH, 1);
		weekday = calender.get(Calendar.DAY_OF_WEEK);
		while(weekday != FirstdayOFWeek){
			System.out.printf("%4s",weekdaysNames[weekday]);
			calender.add(Calendar.DAY_OF_MONTH, 1);
			weekday = calender.get(Calendar.DAY_OF_WEEK);
		}
		System.out.println();
		
		for(int i = 0;i < count; i++){
			System.out.print("    ");
		}
		
		calender.set(Calendar.DAY_OF_MONTH,1);
		while(calender.get(Calendar.MONTH) == month){
			int day = calender.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			if(day == today) 
				System.out.print("*");
			else
				System.out.print(" ");
			
			calender.add(Calendar.DAY_OF_MONTH, 1);
			weekday = calender.get(Calendar.DAY_OF_WEEK);
			
			if(weekday == FirstdayOFWeek) 
				System.out.println();
		}
		if(weekday != FirstdayOFWeek) 
			System.out.println();
	}

}
