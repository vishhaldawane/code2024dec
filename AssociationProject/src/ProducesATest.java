
public class ProducesATest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Cow cow     = new Cow();
		Buffalow buff = new Buffalow();
		Milk milk1  = buff.milkABuffalow();
		//Milk milk1 = cow.milkACow();
		milk1.showMilk();
		
		System.out.println("----------------");

		Curd curd = milk1.coagulate();
		curd.showCurd();
		
		System.out.println("----------------");
		
		Butter butter = curd.churn();
		butter.showButter();
		
		System.out.println("----------------");

		ClarifiedButter clarifiedButter = butter.boil();
		clarifiedButter.showClarifiedButter();
	}

}
class Cow
{
	
	Milk milkACow()
	{
		System.out.println("Milking the cow....");
		Milk milk2 = new Milk("Cow",5,"OffWhite");
		return milk2;
	}
}

class Buffalow
{
	
	Milk milkABuffalow()
	{
		System.out.println("Milking the buffalow....");
		Milk milk2 = new Milk("Buffalow",20,"White");
		return milk2;
	}
}

class Milk
{
	String milkType;
	int quantity;
	String milkColor;
	
	Curd coagulate()
	{
		System.out.println("Milk is coagulated...creating curd...");
		Curd curd = null;
		if(milkType.contains("Cow")) {
			 curd = new Curd(milkType+"'s Curd","Thin","Sour",quantity*0.750f);
		}
		else if(milkType.contains("Buffalow")) {
			 curd = new Curd(milkType+"'s Curd","Thick","Sour",quantity*0.900f);
		} 
			
		return curd;
	}
	
	public Milk(String milkType, int quantity, String milkColor) {
		super();
		this.milkType = milkType;
		this.quantity = quantity;
		this.milkColor = milkColor;
	}
	public String getMilkType() {
		return milkType;
	}
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getMilkColor() {
		return milkColor;
	}
	public void setMilkColor(String milkColor) {
		this.milkColor = milkColor;
	}
	void showMilk()
	{
		System.out.println("Milk Type  : "+milkType);
		System.out.println("Milk Color : "+milkColor);
		System.out.println("Milk Qty   : "+quantity);
		
	}
	
}

class Curd
{
	String type;
	String density;
	String taste;
	float weight;
	
	Butter churn()
	{
		System.out.println("Churning the curd...."+type);
		Butter butter = null;
		
		if(type.contains("Cow")) {
			 System.out.println("Curd Type : "+type);

			 butter = new Butter("Cow","Yellowish", weight/2);
				
		}
		else if(type.contains("Buffalow")) {
			 System.out.println("Curd Type : "+type);

			 butter = new Butter("Buffalow","White", weight/1.25f);
				
		} 
		
		return butter;
	}
	
	public Curd(String type, String density, String taste, float weight) {
		super();
		this.type = type;
		this.density = density;
		this.taste = taste;
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	void showCurd()
	{
		System.out.println("Density : "+density);
		System.out.println("Type    : "+type);
		System.out.println("Taste   : "+taste);
		System.out.println("Weight  : "+weight);
				
	}
	
	
}


class Butter
{
	String type;
	String color;
	float weight;
	
	ClarifiedButter boil()
	{
		System.out.println("Boiling the butter....");
		
		ClarifiedButter clarifiedButter = null;
		if(type.contains("Cow")) {
			 clarifiedButter = new ClarifiedButter("Yellow",weight/2);
			
		}
		else if(type.contains("Buffalow")) {
			 clarifiedButter = new ClarifiedButter("White",weight/1.25f);
			
		}
		return clarifiedButter;
	}
	
	public Butter(String type, String color, float weight) {
		super();
		this.type = type;
		this.color = color;
		this.weight = weight;
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
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	void showButter()
	{
		System.out.println("Type   : "+type);
		System.out.println("Color  : "+color);
		System.out.println("Weight : "+weight);
	}
	
}


class ClarifiedButter 
{
	String color;
	float weight;
	
	public ClarifiedButter(String color, float weight) {
		super();
		this.color = color;
		this.weight = weight;
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
	void showClarifiedButter()
	{
		System.out.println("Color  : "+color);
		System.out.println("Weight : "+weight);
	}
	
}



