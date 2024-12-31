
public class TravellerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Traveller traveller = new Traveller();
		 traveller.relax();
		 traveller.travelling(40);
		 float caloriesBurnt = traveller.workOut(90);
		 System.out.println("calories burnt : "+caloriesBurnt);
		 int alt = traveller.climbedUpTheMountain();
		 System.out.println("Traveller reached at "+alt+" feet altitude");

	}

}

class Traveller
{
	void relax() //1st
	{
		System.out.println("Traverller is relaxing...");
	}
	void travelling(int kms) //2nd
	{
		System.out.println("Traverller is travelled..."+kms+" kilometers");
	}
	float workOut(int minutes) //3rd
	{
		System.out.println("traveller worked out for "+minutes+"mnts and burnt few calories...");
		return minutes*3;
	}
	int climbedUpTheMountain() //4th
	{
		System.out.println("Traveller climbed up a mountain and reached an altitute...");
		return 1100; //feet
	}
	
}


