import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/*
 
 RTTI
 
 Reflection API
 
 every instance of an "Object class"
 got a method called as getClass()
 that returns an instance of "class Class"
 
Class = is used to hold the meta-data of an object
 
 class Object
 {
 			Class getClass()
 			{
 			
 			}
 }
 class Man extends Object
 {
 
 }
 Man manObj = new Man();
 
  
 Annotations = extended version of comments
  			reincarnation of comments
  			
  			
  			annotations are classified
  			in two forms
  			1. source code level
  			2. class file level
  			
  			@RetentionPolicy
  			
  	annotation type
  	1. class level
  	2. method
  	3. field
  	4. argument @PathVariable, @RequestBody
  	5. return type level
  			
  			
 */
public class AnnotationTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man man=new Man("Tom Cruise");
		man.wearingTShirt();
		man.wearingJean();
		man.wearingBelt();
		man.wearingShoes();
		man.wearingGoggles();
		
		
		
		//object crawler or spider
		Class manDetails = man.getClass(); //inherited method
		
		Annotation anno[] = manDetails.getAnnotations();
		for(int i=0;i<anno.length;i++) {
			Annotation classLevelAnno = anno[i];
			System.out.println("Annotation found : "+classLevelAnno);
			Movie movieDetails = (Movie) classLevelAnno;
			System.out.println("Movie name is : "+movieDetails.name());
		
			if(movieDetails.name().equals("Mission Impossible")) {
				System.out.println("It is a blockbuster movie by "+man.name);
			}
			else {
				System.out.println("Its a different movie ");
			}
			
			
		}
		System.out.println("==============");
		Method method[] = manDetails.getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println("Methods : "+method[i]);
			
			Annotation methodAnno[] =method[i].getAnnotations();
			for (int j = 0; j < methodAnno.length; j++) {
				System.out.println(method[j].getName()+ " method name has annotation as  "+methodAnno[j]);
				if(methodAnno[j] instanceof Fashion) {
					Fashion fa = (Fashion) methodAnno[j];
					System.out.println("Fashion : "+fa.type());
				}
			}
			System.out.println("---------");
		}
		
	}

}

@Movie(name="Mission Impossible")

class Man
{
	@CelebrityStyle(name="Hollywood")
	String name;
	
	int age;
	
	Man(String name) {
		this.name = name;
	}
	
	@Fashion(type="currentTrend")
	public void wearingTShirt() {
		System.out.println(name+ " is wearing T Shirt...");
	}
	public void wearingJean() {
		System.out.println(name+ " is wearing Jean");
	}
	public void wearingBelt() {
		System.out.println(name+ " is wearing belt...");
	}
	public void wearingShoes() {
		System.out.println(name+ " wearing shoes");
	}
	public void wearingGoggles() {
		System.out.println(name+ " wearing goggles...");
	}
}


