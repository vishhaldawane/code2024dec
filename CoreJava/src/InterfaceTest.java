
public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Joking joking = new Joker();
		Laughing laughing = joking.makeJoke();
		Smiling smiling = laughing.laugh();
		smiling.smile();
		
	}

}
interface Joking //Joker,Student
{
	Laughing makeJoke();
	
}
interface Laughing //Audience, Friend
{
	Smiling laugh();
}
interface Smiling //Face, Group
{
	void smile();
}

class Joker implements Joking
{
	public Laughing makeJoke()
	{
		Laughing laughing = new Audience();
		return laughing; //Audience's object is returned 
	}
}
class Audience implements Laughing
{
	public Smiling laugh()
	{
		Smiling smiling = new Face();
		return smiling; //Face's object is returned
	}
}
class Face implements Smiling //isA
{
	public void smile()
	{
		System.out.println("Face is smiling...");
	}
}

