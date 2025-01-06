
public class UserDefinedExceptionTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		Car car = new Car();
		try {
			car.startCar();
			car.run();
		}
		catch(CarKeyNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		catch(SpeedExceededException e) {
			System.out.println(e.getMessage());
		} 
		catch (CarInsuranceException e) {
			System.out.println(e.getMessage());
		} 
		catch (CarPucException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End main");
	}
}

class Car 
{
	boolean keyFound=false;
	
	public void startCar() throws CarKeyNotFoundException, CarInsuranceException, CarPucException
	{
		System.out.println("Starting the car...");
		double val = Math.random()%10;
		if(val > 0.25 && val < 0.75) {
			System.out.println("Key Found, Car started...");
			keyFound=true;
		}
		else {
			//System.out.println("Key Not Found, Unable to start the Car...");
			CarKeyNotFoundException carKeyNtFndEx = new CarKeyNotFoundException("Car key is missing");
			throw carKeyNtFndEx;
		}
		double val1 = Math.random()%10;

		if(val1 > 0.15 && val1 < 0.75)  {
			System.out.println("Insurance is up to date");
		}
		else {
			//System.out.println("Key Not Found, Unable to start the Car...");
			CarInsuranceException carInsEx = new CarInsuranceException("Car insurance is expired...");
			throw carInsEx;
		}
		
		double val2 = Math.random()%10;

		if(val2 > 0.15 && val2 < 0.95)  {
			System.out.println("Car Puc is up to date");
		}
		else {
			//System.out.println("Key Not Found, Unable to start the Car...");
			CarPucException carPucEx = new CarPucException("Car Puc is expired...");
			throw carPucEx;
		}
		
	}
	public void run() 
	{
		for (int i = 0; i < 20; i++) {
			System.out.println("Car is running..."+i+" kms");
			double val = Math.random()%10;
			if(val > 0.99) {
				SpeedExceededException speedEx = new SpeedExceededException("Vehicle exceeded the predefined speed");
				throw speedEx;
			}
		}
	}
	
}

class CarKeyNotFoundException extends Exception //isA
{
	CarKeyNotFoundException(String msg)
	{
		super(msg);
	}
}
class CarInsuranceException extends Exception //isA
{
	CarInsuranceException(String msg)
	{
		super(msg);
	}
}
class CarPucException extends Exception //isA
{
	CarPucException(String msg)
	{
		super(msg);
	}
}


class SpeedExceededException extends RuntimeException
{
	SpeedExceededException(String str)
	{
		super(str);
	}
}
