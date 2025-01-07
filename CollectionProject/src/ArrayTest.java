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

		Player player1 = new Player(1,"Sachin T",30,8394);
		Player player2 = new Player(4,"Virat K",20,7344);
		Player player3 = new Player(2,"Mahendra D",25,3344);
		Player player4 = new Player(3,"Yuvraj S",28,4364);
		Player player5 = new Player(5,"Virendra S",27,4324);
		
		//whenever an object reference added with a 
		// string and + sign -> it invokes the toString()
		
		System.out.println("player1 : "+player1); //toString()
		System.out.println("player2 : "+player2);
		System.out.println("player3 : "+player3);
		System.out.println("player4 : "+player4);
		System.out.println("player5 : "+player5);

	}

}
class Player
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
	
	
}