import java.util.TreeMap;

//Map = key and Value

//
class Country
{
	String name;
	String capital;
	String primeMinister;
	String population;
	String currency;
	
	public Country(String name, String capital, String primeMinister, String population, String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.primeMinister = primeMinister;
		this.population = population;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", primeMinister=" + primeMinister + ", population="
				+ population + ", currency=" + currency + "]";
	}
	
	
	
}
class World
{
	TreeMap<String,Country> countryMap = new TreeMap<String,Country>();
	
	public void addCountry(String key, Country country)
	{
		countryMap.put(key, country);
	}
	public Country searchCountry(String key) {
		if(countryMap.containsKey(key)) {
			return countryMap.get(key);
		}
		return null;
	}
	
}

public class MapTest {
	public static void main(String[] args) {
		Country c1 = new Country("India", "New Delhi", "Mr. Narendra Modi", "136.64 Crores", "Rs");
		Country c2 = new Country("Pakistan", "Islamabad", "Mr. Imran Khan", "21.66 Crores", "Pakistani Rupee");
		Country c3 = new Country("China", "Beijing", "Mr. Xi Jinping", "139.77 Crores", "Yuan");
		Country c4 = new Country("England", "London", "Mr. Boriss Johnson", "6.66 Crores", "Pound Sterling");
		Country c5 = new Country("America", "Washington DC", "Mr. Joe Biden", "32.82 Crores", "USD");
		
		World world = new World();
			world.addCountry("IND", c1);
			world.addCountry("PAK", c2);
			world.addCountry("CHI", c3);
			world.addCountry("UK", c4);
			world.addCountry("US", c5);
		
		Country c = world.searchCountry("CHI");
		System.out.println("c "+c);
		
		
		
		
	}
}






