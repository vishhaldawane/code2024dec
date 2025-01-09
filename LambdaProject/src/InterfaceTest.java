//Head First Java 
//The Java Programming Langauge - James Gosling
//poise, pitch, clarity, pause, modulation

public class InterfaceTest {
	public static void main(String[] args) {
	
		Infant infant = new Infant();
		
		Cradle.relax(infant);
		Cradle.wakeUp(infant);
		Cradle.fun(infant);
		
		System.out.println("----------");
		
		Sleeping sleeping1 = 
				()-> {
			System.out.println("Taxi driver is sleeping...");
				}
		;

		Sleeping sleeping2 = ()-> {
			System.out.println("Train Passenger is sleeping...");
		};
		
		Sleeping sleeping3 = ()-> {
			System.out.println("Cat is sleeping...");
		};
		
	}
}
class Driver {}
class TaxiDriver extends Driver implements Sleeping
{
	public void sleep()
	{
		System.out.println("Taxi driver is sleeping..");
	}
}

class Cradle
{
	static void relax(Sleeping x)
	{
		System.out.println("Cradle relax is executing...");
		//x.cry();
		//x.drinkMilk();
		x.sleep();
	}
	static void wakeUp(Crying infant)
	{
	//	infant.sleep();
		infant.cry();
	//	infant.drinkMilk();
	}
	static void fun(Playing playing)
	{
		playing.play();
	//	playing.cry();
	//	playing.sleep();
	//	playing.drinkMilk();
		
	}
}
 
interface Playing
{
	void play();
}

interface Sleeping
{
	void sleep();
}

class Infant implements Crying, Sleeping, Playing
{
	public void cry() //implemented
	{
		System.out.println("Infant is crying...");
	}
	public void play()
	{
		System.out.println("Playing with flash cards...");
	}
	public void sleep() //implemented
	{
		System.out.println("Infant is sleeping for 16 hours...");
	}
	public void drinkMilk() // exclusive 
	{
		System.out.println("Infant is drinking milk...");
	}
}

class Baby extends Infant implements Crawling 
{
	public void crawl()
	{
		System.out.println("Baby is crawling...");
	}
}
class Todler extends Baby implements Standing
{
	public void stand()
	{
		System.out.println("Todler is standing...");
	}
}
class Child extends Todler implements Walking
{
	public void walk()
	{
		System.out.println("Child is walking....");
	}
}
class Adolescent extends Child implements Running
{
	public void run()
	{
		System.out.println("Adolescent is running....");
	}
}
class Adult extends Adolescent implements MarathonRunning
{
	public void runWithStamina()
	{
		System.out.println("Adult running marathon race with stamina...");
	}
}

interface Crying
{
	void cry();
}
interface Crawling
{
	void crawl();
}
interface Standing
{
	void stand();
}
interface Walking
{
	void walk();
}
interface Running2
{
	void run();
}

interface MarathonRunning extends Running2
{
	void runWithStamina();
}
