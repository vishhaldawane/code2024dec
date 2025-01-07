/*
 1		equals() - compare objects
 2		hashCode() - memory address of the object
 
 3		toString() - string representation of the object
 4		finalize() - garbage collection
 5		clone() - copy object
 6		getClass() - meta data of the object
 7		wait() - Multithreading
 8		wait() - Multithreading
 9		wait() - Multithreading
 10		notify() - Multithreading
 11		notifyAll() - Multithreading
 */
public class ArrayTest {

	public static void main(String[] args) {
	
		Player team[] = {
				new Player(1,"Sachin T",30,8394),
				new Player(4,"Virat K",20,7344),
				new Player(2,"Mahendra D",25,3344),
				new Player(3,"Yuvraj S",28,4364),
				new Player(5,"Virendra S",27,4324)	
		};
		
		
		//whenever an object reference added with a 
		// string and + sign -> it invokes the toString()
		
		System.out.println("player1 : "+team[0]); //toString()
		System.out.println("player2 : "+team[1]);
		System.out.println("player3 : "+team[2]);
		System.out.println("player4 : "+team[3]);
		System.out.println("player5 : "+team[4]);

		System.out.println("------");
		for(int i=0;i<team.length;i++) {
			System.out.println("player : "+team[i]);
		}
		System.out.println("----for each----");
		for(Player x : team)
		{
			System.out.println("player : "+x);

		}
	}

}
class Player // extends Object [ 11 methods ]
{
	int playerId;
	String playerName;
	int playerAge;
	float playerScore;
	
	public Player(int playerId, String playerName, int playerAge, float playerScore) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
		this.playerScore = playerScore;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", playerScore=" + playerScore + "]";
	}

}

class Kite
{
	String kiteOwner;
	String kiteColor;
	int kiteLength;
	boolean flying;
	
	public Kite(String kiteOwner, String kiteColor, int kiteLength, boolean flying) {
		super();
		this.kiteOwner = kiteOwner;
		this.kiteColor = kiteColor;
		this.kiteLength = kiteLength;
		this.flying = flying;
	}
	@Override
	public String toString() {
		return "Kite [kiteOwner=" + kiteOwner + ", kiteColor=" + kiteColor + ", kiteLength=" + kiteLength + ", flying="
				+ flying + "]";
	}
	
	
}

/*
 * Collection of objects of the similar or co-variant types
 * 
 * 
 * 		int array[50];
 * 
 * 		int score[]={10,20,30,40};
 * 
 * 
 * 
 */




