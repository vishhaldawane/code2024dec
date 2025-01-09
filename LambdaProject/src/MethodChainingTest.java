
public class MethodChainingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		Liquid liquid1 = new Liquid(1,"Thin","White","LittleSour","SlightSweet",20.1f);
		System.out.println("liquid taste : "+liquid1.getTaste());
		System.out.println("liquid color : "+liquid1.getColor());
		System.out.println("liquid temp  : "+liquid1.getTemperature());

		Fruit fruit = new Fruit("Chickoo","Brown",0.150f,"Sweet");	
		
		Liquid liquid2 = Kitchen.create(liquid1, fruit);
		
		System.out.println("--- after adding Fruit ----");
		System.out.println("liquid taste : "+liquid1.getTaste());
		System.out.println("liquid color : "+liquid1.getColor());
		System.out.println("liquid temp  : "+liquid1.getTemperature());

		Ice ice = new Ice(-5.0f,"Bisleri","Cube",0.150f,4);
		
		Liquid liquid3 = Kitchen.create(liquid2, ice);
		
		System.out.println("--- after adding ice ----");

		System.out.println("liquid taste : "+liquid1.getTaste());
		System.out.println("liquid color : "+liquid1.getColor());
		System.out.println("liquid temp  : "+liquid1.getTemperature());

		System.out.println("--------------");
		
		System.out.println("liquid1 "+liquid1.hashCode());
		System.out.println("liquid2 "+liquid2.hashCode());
		System.out.println("liquid3 "+liquid3.hashCode());
		*/
		
		/*
		Liquid liquid1 = new Liquid(1,"Thin","White","LittleSour","SlightSweet",20.1f);
		Fruit fruit = new Fruit("Chickoo","Brown",0.150f,"Sweet");	
		Ice ice = new Ice(-5.0f,"Bisleri","Cube",0.150f,4);

		System.out.println("color "+liquid1.getColor());
		System.out.println("qty   "+liquid1.getQuantity());
		System.out.println("temp  "+liquid1.getTemperature());

		System.out.println("-------------");
		
		Liquid liquid2 = liquid1.make(fruit);
		
		System.out.println("color "+liquid1.getColor());
		System.out.println("qty   "+liquid1.getQuantity());
		System.out.println("temp  "+liquid1.getTemperature());
		
		System.out.println("-------------");
		
		Liquid liquid3 = liquid1.make(ice);

		System.out.println("color "+liquid1.getColor());
		System.out.println("qty   "+liquid1.getQuantity());
		System.out.println("temp  "+liquid1.getTemperature());

		System.out.println("-------------");
		
		System.out.println("liquid  "+liquid1);
		System.out.println("liquid2 "+liquid2);
		System.out.println("liquid3 "+liquid3);
		*/
		
		Liquid liquid1 = new Liquid(1,"Thin","White","LittleSour","SlightSweet",20.1f);
		Fruit fruit = new Fruit("Chickoo","Brown",0.150f,"Sweet");	
		Ice ice = new Ice(-5.0f,"Bisleri","Cube",0.150f,4);

		Liquid x = liquid1.addFruit(fruit).addIce(ice);
		System.out.println("color "+x.getColor());
		System.out.println("qty   "+x.getQuantity());
		System.out.println("temp  "+x.getTemperature());

		Talk talk = new Talk("Salary Topic");
		talk.chatting("What is your salary").chatting("My Salary is 25000").chatting("Are Meri to 30000 hai");
		
		System.out.println("line "+talk.line);
		
		
	}
}
//stream = flow 
class Talk
{
	String line;
	
	Talk(String l) {
		line = l;
	}
	
	Talk chatting(String str)
	{
		 this.line = this.line + str;
		 return this;
	}
}

class Liquid
{
	float  quantity;//weight
	String density;//skin
	String color;//eye
	String taste;//tongue
	String odour; //nose
	float temperature;
	
	Liquid addFruit(Fruit fruit)
	{
		 setQuantity(getQuantity()+fruit.getWeight());
		 setColor(fruit.getColor());
		 setTaste(fruit.getTaste());
		 return this;
	}
	
	Liquid addIce(Ice ice)
	{
		 setQuantity(getQuantity()+ice.getWeight());
		 setTemperature(getTemperature()+ice.getTemperature());
		 return this;
	}
	
	public Liquid(float quantity, String density, String color, String taste, String odour, float temp) {
		super();
		this.quantity = quantity;
		this.density = density;
		this.color = color;
		this.taste = taste;
		this.odour = odour;
		this.temperature = temp;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getDensity() {
		return density;
	}

	public void setDensity(String density) {
		this.density = density;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTaste() {
		return taste;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}

	public String getOdour() {
		return odour;
	}

	public void setOdour(String odour) {
		this.odour = odour;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	
	
	
	
}


class Fruit
{
	String fruitName;
	String color;
	float weight;
	String taste;
	
	public Fruit(String fruitName, String color, float weight, String taste) {
		super();
		this.fruitName = fruitName;
		this.color = color;
		this.weight = weight;
		this.taste = taste;
	}
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	
}

class Ice
{
	float temperature;
	String waterType;
	String shape;
	float weight;
	int quantity;
	
	public Ice(float temperature, String waterType, String shape, float weight, int quantity) {
		super();
		this.temperature = temperature;
		this.waterType = waterType;
		this.shape = shape;
		this.weight = weight;
		this.quantity = quantity;
	}
	
	
	
	
	public String getWaterType() {
		return waterType;
	}




	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}




	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}

class Kitchen
{
	static Liquid create(Liquid x, Fruit fruit)
	{
		 x.setQuantity(x.getQuantity()+fruit.getWeight());
		 x.setColor(fruit.getColor());
		 x.setTaste(fruit.getTaste());
		 return x;
	}
	
	static Liquid create(Liquid x, Ice ice)
	{
		 x.setQuantity(x.getQuantity()+ice.getWeight());
		 x.setTemperature(x.getTemperature()+ice.getTemperature());
		 return x;
	}
}


