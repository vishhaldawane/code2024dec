import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {

	public static void main(String[] args) {

		try {
			System.out.println("Trying to open the file...");
			FileInputStream fin = new FileInputStream("/Users/apple/abc.txt");
			System.out.println("File is ready to read...");
			
			byte b = (byte) fin.read(); //read first letter
			while  ( b != -1 )// check EOF
			{
				System.out.print((char)b);
				b = (byte) fin.read(); //read successive bytes
				Thread.sleep(10);
			}
			System.out.println("Trying to close the file");
			fin.close();
			System.out.println("File is closed...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
