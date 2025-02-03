
public class SingletonTest {
	public static void main(String[] args) {
		
		Heart heart1 =  Heart.getHeart();
		System.out.println("heart : "+heart1);
		
		Heart heart2 = Heart.getHeart();
		System.out.println("heart : "+heart2);
		
		Heart heart3 = Heart.getHeart();
		System.out.println("heart : "+heart3);
	}
}

class Heart
{
	static Heart heartRef=null;
	
	private Heart() {
		System.out.println("Heart() ctor.... invoked...");
	}
	public static Heart getHeart() {
		if(heartRef == null)
			heartRef = new Heart();
		
		return heartRef;
	}
}




