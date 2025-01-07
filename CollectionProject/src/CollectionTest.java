import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1 = new Song("My Heart Will Go On", "Celine D", "Titanic", 1996);
		Song s2 = new Song("Zhingat", "Ajay Atul", "Sairat", 2016);
		Song s3 = new Song("I want it that way","Backstreet Boys", "Backstreet Boys", 1998);
		Song s4 = new Song("Kolavari", "Dhanush", "3", 2014);
		Song s5 = new Song("Lungi Dance", "Honey Singh","Chennai Express", 2019);
		System.out.println("Content is created...");
		
		System.out.println("Creating container....");
		ArrayList<Song> playList = new ArrayList<Song>();
		System.out.println("Container created...");

		System.out.println("Adding content to the container...");
		playList.add(s1);
		
		System.out.println("Adding content to the container...");
		playList.add(s2);

		System.out.println("Adding content to the container...");
		playList.add(s3);
		
		System.out.println("Adding content to the container...");
		playList.add(s4);
		
		System.out.println("Adding content to the container...");
		playList.add(s5);
		
		System.out.println("-------- lets print it ------");
		
		Iterator<Song> songIterator = playList.iterator();
		System.out.println("Stepping through the container...");
		
		while(songIterator.hasNext())
		{
			Song theSong = songIterator.next();
			System.out.println("Song : "+theSong);
		}
	}

}
class Song 
{
	private String title;
	private String artist;
	private String album;
	private int year;
	
	
	public Song(String title, String artist, String album, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year + "]";
	}

}



/*

			Component's Orthogonal Space
	
			Efficiency	vs	Flexibility
			speed			storage/space
			
			
						x -- Content
						|		ButterMilk*
						|		FriedRice
						|		PaneerChilly
						|		Noodles
						|       int,int
		---------------------------------
		|				|				|
		y				i				z
		|				|				|
	Container	    Iterator		Algorithm
	  |					|				|
	 SteelGlass		  Straw*			drink()*
	 Plate			  Spoon				eat()	
	 Bottle*		  Fork				pokeAndEat()
	 Bowl			  ChopSticks	
	 AnyPair			print()			swap()
	 ArrayList		ListIterator		...sort,search,add	
*/






