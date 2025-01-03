package jungle.cave;

public class Lion {
	
	private int privateA=100;
	public  int publicA=200;
	        int defaultA=300;
	protected int protectedA=400;
	
	public Lion() {
		
	}
	public void roar() {
		System.out.println("Lion is roaring...");
	}
}
class Rat
{
	void play()
	{
		Lion lion = new Lion();
		lion.roar();
		System.out.println("private "+lion.privateA);
		System.out.println("private "+lion.publicA);
		System.out.println("private "+lion.defaultA);
		System.out.println("private "+lion.protectedA);

	}
}

class Rat
{
	void play()
	{
		Lion lion = new Lion();
		lion.roar();
		System.out.println("private "+lion.privateA);
		//System.out.println("private "+lion.publicA);
		System.out.println("private "+lion.defaultA);
		System.out.println("private "+lion.protectedA);

	}
}
 
  

