
public class FinalFieldTest {
	public static void main(String[] args) {
		//local variable below
		
		final float PI=3.14f; //22/7
		System.out.println("PI : "+PI);
//The final local variable PI cannot be assigned. 
//It must be blank and not using a compound assignment		
		//PI=3.18f;
		System.out.println("PI : "+PI);
		
	}
}
