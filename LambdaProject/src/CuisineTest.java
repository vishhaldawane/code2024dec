import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CuisineTest { //UserInterface

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter number of dishes : ");
		int numOfDishes=scan1.nextInt();
		
		List<Dish> dishDetails = new ArrayList<Dish>(); 
		System.out.println("Enter dishdetails : ");
		
		for(int i=0;i<numOfDishes;i++) {
			String details = scan1.next(); // Noodles:Chinese:150:4.5
			String dishArray[] = details.split(":");
			//dishArray[]={"Noodles","Chinese","150","4.5"};
			
			String dishName = dishArray[0];
			String cuisine = dishArray[1];
			double price = Double.parseDouble(dishArray[2]);
			double rating = Double.parseDouble(dishArray[3]);
			Dish dish = new Dish(dishName,cuisine,price,rating);

			dishDetails.add(dish);
		}
		System.out.println("Enter cuisine to search : ");
		String cuisineToSearch = scan1.next();
		
		DishUtil dishUtil = new DishUtil();
		
		List<Dish> cuisineListFound = dishUtil.getDishesByCuisine(dishDetails.stream(), cuisineToSearch );
		
		for(Dish dish : cuisineListFound) {
			System.out.println("Dish : "+dish);
		}
		
		System.out.println("--------------");
		System.out.println("Enter rating to search : ");
		double ratingsToSearch = scan1.nextDouble();
		
		List<Dish> cuisineListFoundByRating = dishUtil.getDishesByRating(dishDetails, ratingsToSearch);
		for(Dish dish : cuisineListFoundByRating) {
			System.out.println("Dish : "+dish);
		}
		
		System.out.println("--------------");
		System.out.println("Enter cuisine and rating to search : ");
		String str = scan1.next(); // chinese:4.3
		
		String cuisineAndRating[] = str.split(":");
		String cuisine = cuisineAndRating[0];
		double rating  = Double.parseDouble(cuisineAndRating[1]);
		
		List<Dish> cuisineListFoundByCuisineAndRating = dishUtil.getDishesByCuisineAndRating(dishDetails, cuisine, rating);
		for(Dish dish : cuisineListFoundByCuisineAndRating) {
			System.out.println("Dish : "+dish);
		}
	}

}
class Dish //Entity - Pojo - Bean - Component
{
	String dishName; //Noodles
	String cuisine; //Chinese
	double price; // 150
	double rating; // 4.5
	
	public Dish(String dishName, String cuisine, double price, double rating) {
		super();
		this.dishName = dishName;
		this.cuisine = cuisine;
		this.price = price;
		this.rating = rating;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Dish [dishName=" + dishName + ", cuisine=" + cuisine + ", price=" + price + ", rating=" + rating + "]";
	}
	
	
}

/*
 * 1 italian
 * 2 4.1
 * 3 chinese:4.3
 * 
Noodles:chinese:150:4.3
Chhole:indian:90:4.4
Poha:indian:30:4.1	
Pasta:italian:120:4.3
FriedRice:chinese:120:4.1
Manchurian:chinese:110:4.3
Idli:indian:50:4.3
Samosa:indian:20:4.1
Dosa:indian:50:4.3
PaneerChilly:chinese:150:4.3
 
 */
// it is good to 'feel good', to maintain good habits
// it is bad  to 'feel bad' to remove bad habits

//karna : ane : pasand : reward

//practice ...
class DishUtil
{								
	List<Dish> getDishesByCuisine(Stream <Dish>dishStream, String cuisine)
	{
		
		return dishStream.
				filter( 
						(d)->d.getCuisine().equals(cuisine) )
				.collect(Collectors.toList());
		//return null;
	}
	
	List<Dish> getDishesByRating(List <Dish>dishList, double rating)
	{
		return dishList.stream().
				filter( (d)-> d.getRating() == rating)
				.collect(Collectors.toList());
		
		//return dishStream.filter( (d)->d.getCuisine().equals(cuisine) ).collect(Collectors.toList());
		//return null;
	}
	
	List<Dish> getDishesByCuisineAndRating(List <Dish>dishList, String cuisine, double rating)
	{
		return dishList.stream().
				filter( 
						(d)-> d.getCuisine().equals(cuisine) 
						&& d.getRating() == rating)
				.collect(Collectors.toList());	
	}
}








