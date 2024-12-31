
public class Test {
	public static void main(String[] args) {
		Actor actor1 = new Actor("Madhuri Dixit Nene",50);
		actor1.dance();
		actor1.acting();
		actor1.crying();
		actor1.laughing();
		
		Actor actor2 = new Actor("Sushant Singh",28);
		actor2.dance();
		actor2.acting();
		actor2.crying();
		actor2.laughing();
	}
}
class Actor
{
	String actorName;
	int age;
	
	Actor(String name, int a) {
		actorName = name;
		age = a;
	}
	
	void dance() {
		System.out.println(actorName+" is dancing");
	}
	void acting() {
		System.out.println(actorName+" is acting");

	}
	void crying() {
		System.out.println(actorName+" is crying");

	}
	void laughing() {
		System.out.println(actorName+" is laughing");

	}
}
