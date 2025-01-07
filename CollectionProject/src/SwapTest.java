
public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerPair intPair = new IntegerPair(10,20);
		intPair.printIntegerPair();
		intPair.swap();
		intPair.printIntegerPair();
		System.out.println("--------------");
		FloatPair floatPair = new FloatPair(12.3f, 88.5f);
		floatPair.printFloatPair();
		floatPair.swap();
		floatPair.printFloatPair();
		
		
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







