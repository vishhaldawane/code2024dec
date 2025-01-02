
public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			GraphicalChess gc = new GraphicalChess();
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
	
	void moveKnight() {//overridden
		System.out.println("moving L shape (2.5) steps");
	}
}

//Nupur
class GraphicalChess extends Chess
{
	void moveKnight() {//over-riding
		super.moveKnight();
		System.out.println("moving L shape on gui panel screen");
	}
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




























