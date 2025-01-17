import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		System.out.println("Begin");

		String cities [] = new String[10];
		cities[5]="MUMBAI";
		
		Optional<String> unknownCity =
				Optional.ofNullable(cities[5]);
		
		if(unknownCity.isPresent()) {
			String city = cities[5].toLowerCase();
			System.out.println("citi in lower "+city);
		}
		else {
			System.out.println("city is null");
		}
		
		System.out.println("End");
	}
}

