import java.time.*;
/*
 * @version 1.8 2017-11-05 Sun.
 * @author Vulcan
 * Request:
 * A calender program using Class-LocalData and Class-DayOfWeek. 
 */
public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();
		//System.out.println(month+" "+day);
		
		date = date.minusDays(day - 1);	//Set to start of month
		//System.out.println(date);
		DayOfWeek weekday = date.getDayOfWeek();
		//System.out.println(weekday);
		int value = weekday.getValue();	// 1=Monday,...7=Sunday
		
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		while(value-- > 0) {
			System.out.print("   ");
		}
		while(date.getMonthValue() == month) {
			System.out.printf("%3d", date.getDayOfMonth());
			if(date.getDayOfMonth() == day) {
				System.out.print('*');
			}
			else {
				System.out.print("  ");
			}
			date = date.plusDays(1);
			if(date.getDayOfWeek().getValue() == 1)
				System.out.println();
		}
		
	}

}
