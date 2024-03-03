import java.io.File;
import java.io.IOException;

public class FileHandling_1 {

	public static void main(String[] args) {
		// how to create a file in Java :
		 try {
	            File Obj = new File("myfile.txt");
	            if (Obj.createNewFile()) {
	                System.out.println("File created: "
	                                   + Obj.getName());
	            }
	            else {
	                System.out.println("File already exists.");
	            }
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }

	}

}
