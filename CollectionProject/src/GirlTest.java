
public class GirlTest {
	public static void main(String[] args) {
		Girl girl1 = new Girl("Seeta");
		Girl girl2 = new Girl("Geeta");
		Girl girl3 = new Girl("Reeta");

		girl1.talk(girl2,girl3);
	}
}

class Girl
{
	String name;
	
	public Girl(String name) {
		super();
		this.name = name;
	}
	void talk(Girl x, Girl y)
	{
		System.out.println(name+","+x.name+" and "+y.name+" are chatting...");
	}
}