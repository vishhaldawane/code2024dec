
public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Master d = new Disciple();
			d.fight();
			//d.fightWithStamina();
			
			Chess gc = new GraphicalChess();
			gc.moveKnight();
			
			if(gc instanceof Chess) {
				System.out.println("yes");
			}
			else {
				System.out.println("No");

			}
	}

}
//visualize any Instrument
//visualize any MusicalInstrument
//visualize any StringBasedMusicalInstrument
//visualize any Guitar

/*
 * What is an "abstract" class
 * 				  |
 * 				incomplete
 * 
 * 
 */
interface Instrument
{
	public abstract void use();//undefined
}
abstract class MusicalInstrument implements Instrument
{
	abstract void play();//undefined
	
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();//undefined
}

//The type Guitar must implement the inherited abstract method StringBasedMusicalInstrument.tuneStrings()
//The type Guitar must implement the inherited abstract method Instrument.use()
//The type Guitar must implement the inherited abstract method MusicalInstrument.play()
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {}//3) implemented (mandate)
	void play() {}//3) implemented (mandate)
	void tuneStrings() {}//3) implemented (mandate)
	
	void pluck() {}//1) exclusive
}
class ElectricGuitar extends Guitar
{
//all above 4 funs are 2)inherited	
	void pluck() {}//4) re-writing ( overridden )
}

//Aaditi
class Chess
{//pawn,Rook, Bishop(camel), Knight, Queen, King
	
	final void moveKnight() {//overridden
		System.out.println("moving L shape (2.5) steps");
	}
}

//Nupur
class GraphicalChess extends Chess
{
	//Cannot override the final method from Chess
	
}


interface A{ 
	void fun();
}
//The type B must implement the
//inherited abstract method A.fun()
abstract class B implements A
{
	abstract void foo();
}
abstract class C extends B
{
	
}
class Master
{
	final void fight()
	{
		System.out.println("Master is teaching how to fight and defend");
	}
}
class Disciple extends Master
{
	void fightWithStamina()
	{
		System.out.println("Disciple knows hot to fight with stamina...");
	}
}



























