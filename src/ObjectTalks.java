
public class ObjectTalks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Girl("Shweta").makeTea();
		
		//a.gossip("Riya").makeTea();; //.talk("Julie").makeTea();
		
		
		//a.makeTea();
		
		new Girl("Shweta").gossip("Julie").talk("Jane").makeTea("Julia").washCup("Simmy");;
	}

}
//isA hasA usesA  producesA
//java master

class Girl
{
	String name;
	Girl(String name) {
		this.name = name;
	}
	Girl gossip(String anotherName) {
		System.out.println(name +" is gossiping with "+anotherName);
		Girl anotherGirl= new Girl(anotherName);
		return anotherGirl;
	}
	Girl talk(String g) {
		System.out.println(name+" talking with "+g);
		Girl x = new Girl(g);
		return x;
	}
	Girl makeTea(String thatName) {
		System.out.println(name+" is making tea");
		Girl g = new Girl(thatName);
		return g;
	}
	void washCup(String herName) {
		System.out.println(herName+" washing the cup");
	}
}