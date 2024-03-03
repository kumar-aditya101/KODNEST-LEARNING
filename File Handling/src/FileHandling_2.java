import java.io.FileWriter;
import java.io.IOException;

public class FileHandling_2 {

	public static void main(String[] args) {

		// Write to a File: We use the FileWriter class along with its write() method in
		// order to write some text to the file.
		try {
			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Files in Java are seriously good!!");
			Writer.close();
			System.out.println("Successfully written.");
		} catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}

	}

}
