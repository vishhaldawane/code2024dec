
public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnyPair pair1 = new AnyPair(10,20);
		pair1.printAnyPair();
		pair1.swap();
		pair1.printAnyPair();
		
		System.out.println("--------------");
		
		AnyPair pair2 = new AnyPair(12.3f, 88.5f);
		pair2.printAnyPair();
		pair2.swap();
		pair2.printAnyPair();
		
		System.out.println("--------------");
		
		AnyPair pair3 = new AnyPair("Jack", "Julie");
		pair3.printAnyPair();
		pair3.swap();
		pair3.printAnyPair();
		
	}
	
}

class  AnyPair<T> // <-- Generic Container
{
	T i; // <-- Generic Content
	T j;
	
	public AnyPair(T i, T j) {
		super();
		this.i = i;
		this.j = j;
	}
	void printAnyPair() //Generic Iterator [ below only print]
	{
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	void swap() //Generic Algorithm
	{
		System.out.println("--swapping----");
		T temp = i;
		i = j;
		j = temp;
		System.out.println("--swapped----");
	}	
}

//i want the swap activity to be done for 10.4f and 56.9f too
class  IntegerPair
{
	int i;
	int j;
	
	public IntegerPair(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	void printIntegerPair()
	{
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	void swap()
	{
		System.out.println("--swapping----");
		int temp = i;
		i = j;
		j = temp;
		System.out.println("--swapped----");
	}
	
	
}

class  FloatPair
{
	float i;
	float j;
	
	public FloatPair(float i, float j) {
		super();
		this.i = i;
		this.j = j;
	}
	void printFloatPair()
	{
		System.out.println("i "+i);
		System.out.println("j "+j);
	}
	void swap()
	{
		System.out.println("--swapping----");
		float temp = i;
		i = j;
		j = temp;
		System.out.println("--swapped----");
	}
	
	
}







