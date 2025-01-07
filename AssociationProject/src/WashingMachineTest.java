
public class WashingMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Machine
{
	
}
class WashingMachine extends Machine //isA
{
	WashingTub washingTub = new WashingTub(); //hasA

//returning		
//objects		//passing objects = usesA
	Laundry      wash(Water w, Detergent d, Electricity e, Cloth c)
	{//producesA
		
		Laundry laundry = new Laundry();
		return laundry;
	}
}

class WashingTub
{
	
}
class Water { }
class Detergent { }
class Electricity { }
class Cloth { }
class Laundry { }

/*--------------*/


class Lens
{
	
}
class Photo { }
class Camera //<-- whole entity
{
	Lens lens = new Lens(); //hasA -- part entity - essential
	
	Photo click()
	{
		return new Photo();
	}
}
class VideoCamera extends Camera //isA
{
	
	VideoClip record(Scene s, LightEffect lf, ShadowEffect sf)
	{
		return new VideoClip();
	}
}
class VideoClip
{
	
}
class Scene
{
	
}
class Effect
{
	
}
class LightEffect extends Effect
{
	
}
class ShadowEffect extends Effect
{
	
}


/*
class Engine
{
	
}
class Car extends Engine // isA -- wrong way
{
	
}
*/

class LandVehicle
{
	
}
class Engine
{
	
}
class Car extends LandVehicle
{
	Engine eng = new Engine(); // hasA
}






