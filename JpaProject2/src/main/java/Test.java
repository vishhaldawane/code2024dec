
public class Test {
	public static void main(String[] args) {
		StrawberriesGardenFactory sgf = Mahabaleshwar.createStrawberriesGardenFactory();
		StrawberriesGarden sg = sgf.createStrawberriesGarden("khatte");
		sg.grow();
	}
}
class Mahabaleshwar
{
	public static StrawberriesGardenFactory createStrawberriesGardenFactory()
	{
		StrawberriesGardenFactory sgf = new ShwetasStrawberriesGardenFactory();
		return sgf;
	}
}
interface StrawberriesGardenFactory
{
	StrawberriesGarden createStrawberriesGarden(String hint);

}
class ShwetasStrawberriesGardenFactory implements StrawberriesGardenFactory
{
	public StrawberriesGarden createStrawberriesGarden(String hint)
	{
		StrawberriesGarden sg = null;
		if(hint.equalsIgnoreCase("mithhe")) {
			sg =  new SweetStrawberriesGarden();
		}
		else if(hint.equalsIgnoreCase("khatte")) {
			sg =  new SourStrawberriesGarden();
		}
		else if(hint.equalsIgnoreCase("khattemithhe")) {
			sg =  new SweetAndSourStrawberriesGarden();
		} 
	
		return sg;
	}
}

/*--------------------------*/



interface StrawberriesGarden
{
	void grow();	
}


class SweetStrawberriesGarden implements StrawberriesGarden
{
	public void grow() {
		System.out.println("Growing sweet strawberries..");
	}
}
class SourStrawberriesGarden implements StrawberriesGarden
{
	public void grow() {
		System.out.println("Growing sour strawberries..");
	}
}
class SweetAndSourStrawberriesGarden implements StrawberriesGarden
{
	public void grow() {
		System.out.println("Growing Sweet and Sour strawberries..");
	}
}

/*
 		
 		StrawberriesGardenFactory <--i
 			|	StrawberriesGarden createStrawberriesGarden();
			|
 		ShwetasStrawberriesGardenFactory<--impl
 		
 		
 		
 		
			StrawberriesGarden <-- interface
					|grow();
		-----------------------------
		|				|			|
SweetStrawberriesGarden	|			| <-impl1
		SourStrawberriesGarden		| <-impl2
				SweetAndSourStrawberriesGarden <-impl3

 */
