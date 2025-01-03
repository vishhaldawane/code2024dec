
public class CircleTest {
	public static void main(String[] args) {
		
		String flower1="ROSE";
		System.out.println("Flower "+flower1);
		System.out.println("Flower "+flower1.hashCode());
		
		String flower2="ROSE";
		System.out.println("Flower "+flower2);
		System.out.println("Flower "+flower2.hashCode());
		
		String flower3="ROSE";
		System.out.println("Flower "+flower3);
		System.out.println("Flower "+flower3.hashCode());
		
		Car car1 = new Car("MH-06-1234");
		Car car2 = new Car("MH-12-8393");
		Car car3 = new Car("MH-14-8734");
		
		car1.showCar();
		car2.showCar();
		car3.showCar();
		
		
		
		Circle circle1 = new Circle(30);
		Circle circle2 = new Circle(60);
		Circle circle3 = new Circle(90);

		circle1.calculateArea();
		circle2.calculateArea();
		circle3.calculateArea();

	}
}

class Circle
{
	int radius;
	static final float PI=3.14f; //universal constant
	float area ;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	void printCircle()
	{
		System.out.println("Radius of circle : "+radius);
	}
	void calculateArea()
	{	
		area = PI * radius * radius;
		System.out.println("Area of Circle : "+area);
	}
}

class Car
{
	final String numberPlate;
	
	Car(String np) {
		numberPlate = np;
	}
	void showCar()
	{
		System.out.println("Car number plate : "+numberPlate);
		System.out.println("address of numberPlate : "+numberPlate.hashCode());
	}
}

