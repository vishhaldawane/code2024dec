import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song s1 = new Song("My Heart Will Go On", "Celine D", "Titanic", 1996);
		Song s2 = new Song("Zhingat", "Ajay Atul", "Sairat", 2016);
		Song s3 = new Song("I want it that way","Backstreet Boys11", "Backstreet Boys", 2016);

		Song s4 = new Song("Kolavari", "Dhanush", "3", 2016);
		Song s5 = new Song("Lungi Dance", "Honey Singh","Chennai Express", 2019);
		Song s6 = new Song("I want it that way","Backstreet Boys11", "Backstreet Boys", 1998);

		System.out.println("Content is created...");
		
		Song s7 = s5;
		//equal(means data wise equal)
		//objects must  have equal hashcode
		
		
		
		
		
		System.out.println("Creating container....");
		//ArrayList<Song> jukeBox = new ArrayList<Song>();
	//	LinkedList<Song> jukeBox = new LinkedList<Song>();
	//	TreeSet<Song> jukeBox = new TreeSet<Song>();
		HashSet<Song> jukeBox = new HashSet<Song>();

		System.out.println("Container created...");
		System.out.println("---------");
		
		System.out.println("Adding 1st content to the container...");
		jukeBox.add(s1);
		System.out.println("---------");
		
		System.out.println("Adding 2nd content to the container...");
		jukeBox.add(s2);
		System.out.println("---------");
		
		 //s1.talk(s5)

		System.out.println("Adding 3rd content to the container...");
		jukeBox.add(s3);
		System.out.println("---------");
		
		System.out.println("Adding 4th content to the container...");
		jukeBox.add(s4);
		System.out.println("---------");
		
		System.out.println("Adding 5th content to the container...");
		jukeBox.add(s5);
		System.out.println("---------");
		
		System.out.println("Adding 6th content to the container...");
		jukeBox.add(s6);
		System.out.println("---------");
		
		System.out.println("Adding 7th content to the container...");
		jukeBox.add(s7);
		System.out.println("---------");
		
		System.out.println("-------- lets print it ------");
		
		Iterator<Song> songIterator = jukeBox.iterator();
		System.out.println("Stepping through the container...");
		
		while(songIterator.hasNext())
		{
			Song theSong = songIterator.next();
			System.out.println("Song : "+theSong);
		}
		
	}

}
class Song implements Comparable<Song>
{
	private String title;
	private String artist;
	private String album;
	private int year;
	
	
	
	
	


	


	@Override
	public int hashCode() {
		System.out.println("hashCode invoked....");

		return Objects.hash(year);
		
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("equals invoked....");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		return year == other.year;
	}


	//	public int compareTo(Song x)
//	{
//		System.out.println("comparing "+title+ " with "+x.title);
//		return title.compareTo(x.title);
//	} 
//	public int compareTo(Song x)
//	{
//		System.out.println("comparing "+artist+ " with "+x.artist);
//		return artist.compareTo(x.artist);
//	}
	public int compareTo(Song x)
	{
		System.out.println("comparing "+year+ " with "+x.year);
		return Integer.compare(x.year, year);
	} 
	
	
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






