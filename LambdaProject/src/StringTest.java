
public class StringTest {


	public static void main(String[] args) throws Exception {
		System.out.println(test("hannaaajo", "john"));
	}

	public static boolean test(String searchIn, String searchFor) {
    for (char c : searchFor.toCharArray()) {
        System.out.println(" searchIn : "+searchIn);

        
        if (searchIn.indexOf(c) == -1) {
        	System.out.println("false : "+c);
            return false;
        }
        searchIn = searchIn.replaceFirst(Character.toString(c), "");

    }
    return true;
	}
}
