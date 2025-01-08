//IMPLEMETATION OF Talking
public class Human implements Talking {
	public void talk() {
		System.out.println("Human is Talking...");
	}
	public Account talk(Running r) {
		System.out.println("Human is talking...");
		r.run();
		Account a = new SavingsAccount();
		return a;
	}

}
