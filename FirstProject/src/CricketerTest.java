
public class CricketerTest {

	public static void main(String[] args) {
	
		System.out.println("Cricketer test");
//		classname  refname = allocator  constructor
//			|		|		 |			  |	
		Cricketer virat = new 	Cricketer(); //object is created
		virat.hit();
		int currentScore = virat.hitIt(24,"Leg Spin");
		System.out.println("Current score is : "+currentScore);
		
		currentScore = currentScore + virat.hitIt(50,"Off Spin");
		System.out.println("Current score is : "+currentScore);

		currentScore = currentScore + virat.hitIt(150,"Yorker");
		System.out.println("Current score is : "+currentScore);
		
		currentScore = currentScore + virat.hitSixer();
		System.out.println("Current score is : "+currentScore);
		
		
		virat.hitting(123);
		virat.hitSixer();
		
	}

}
class Cricketer
{
	//1 function without argument/parameters, and without return value	
	void hit()
	{
		System.out.println("Hitting the ball...");
	}
	//2. function WITH argument/parameters, BUT without return value
	void hitting(int speedOfTheBall)
	{
		System.out.println("Batting the ball of speed "+speedOfTheBall+" kmph");
	}
	
	//3. function WITH argument/parameters, AND WITH return VALUE
	int hitIt(int speedOfTheBall, String spinType) 
	{
		System.out.println("Batted the ball of speed "+speedOfTheBall+"kmph with "+spinType);
		return 3;
	}
	
	//4. function WITHOUT argument/parameters, BUT WITH return value
	int hitSixer()
	{
		System.out.println("Hitting the sixer.....and generating six runs...");
		return 6;
	}
}
