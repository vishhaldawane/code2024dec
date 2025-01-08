import java.time.LocalDate;

public class CalendarTest {
	public static void main(String[] args) {
		
		LocalDate dob= LocalDate.now(); //static 
		
		
		MyCalendar myCal = new LunarCalendar();
		myCal.movement();
		myCal.of();
		//myCal.calcMoonPosition();
		
	}
}

interface MyCalendar
{
	MyCalendar  of();
	
	//default function can have a body in an interface;
	default void movement() {
		System.out.println("movement...");
	}
}

class LunarCalendar implements MyCalendar
{
	public MyCalendar of() {
		LunarCalendar lunar = new LunarCalendar();
		return lunar;
	}
	void calcMoonPosition() {
		System.out.println("Calculatingmoons position");
	}
}