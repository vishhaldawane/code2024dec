import java.util.Arrays;

class Cow
{
	Milk milkACow() {
		System.out.println("milking a cow ....");
		return new Milk();
	}
}
class Milk
{
	Curd coagulate() {
		System.out.println("coagulating milk....");
		return new Curd();
	}
}
class Curd
{
	Butter churn() {
		System.out.println("churning curd....");

		return new Butter();
	}
	void churn(int x) {
		System.out.println("churned for "+x+" minutes");
	}
}
class Butter
{
	ClarifiedButter boil() {
		System.out.println("boiling butter....");

		return new ClarifiedButter();
	}
}
class ClarifiedButter
{
	void pureGhee() {
		System.out.println("Pure Ghee is healthy....");
	}
}
public class ChainingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClarifiedButter c = 
		new Cow().milkACow().coagulate().churn().boil().pureGhee();;
		//c.pureGhee();
		System.out.println("--------");
		new Cow().milkACow().coagulate().churn(5);
		System.out.println("--------");

		
		Student student = new Student();
		Game g = student.fun();
		
		Score s = g.play();
		
		CurrentAccount ca = s.card();
		
		ca.showBalance();
		
		student.fun().play().card().showBalance();
	//	student.fun().play().card().showBalance();
		 //        Game	   Score  CurrentAccount
		
		/*
		String str = student.study1("Julie");
		System.out.println("str "+str);
		
		System.out.println("---------");
		
		String str2 = student.study2("Julie",2);
		System.out.println("str2 "+str2);
		
		System.out.println("---------");
		
		String subs[] = student.study3("Julie");
		
		System.out.println("---------");
		
		System.out.println("subjects count "+subs.length);
		System.out.println("subjects "+Arrays.toString(subs));
		
		*/
		
		
	}

}
class CurrentAccount
{
	void showBalance()
	{
		System.out.println("Account:showBalance() invoked... : Account balance is 50000");
	}
}
class Score
{
	CurrentAccount card()
	{
		System.out.println("Score:card() invoked.. producing Account");
		return new CurrentAccount();
	}
}
class Game
{
	Score play() {
		System.out.println("Game:play() invoked....playing game...");
		return new Score();
	}
}
class Student
{
	String subjects[]={"Maths","Science","English"};
	
	Game fun() {
		System.out.println("Student:fun() invoked....");
		return new Game();
	}
	
	String study1(String str)
	{
		System.out.println(str+ " is studying..");
		return subjects[0];
	}
	
	String study2(String str, int pos)
	{
		System.out.println(str+ " is studying..");
		return subjects[pos];
	}
	
	String[] study3(String str)
	{
		System.out.println(str+ " is studying..");
		return subjects;
	}
}