package jungle;

import jungle.cave.Lion;

public class PackageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin Main");
		
		//Lion cannot be resolved to a type
		Lion lion = new Lion();
		lion.roar();
		System.out.println("lions private : "+lion.privateA);
		System.out.println("lions public  : "+lion.publicA);
		
		System.out.println("End Main");
		
	}

}
