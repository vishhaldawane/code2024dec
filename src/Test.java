
public class Test {
	public static void main(String[] args) {
		Car car = new Car();//Running
		Human human = new Human();
		Account a = human.talk(car);
		a.withdraw();
	}

}
