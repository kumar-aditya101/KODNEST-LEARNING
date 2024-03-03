import java.io.File;

public class FileHandling_4 {

	public static void main(String[] args) {
		// Delete a File: We use the delete() method in order to delete a file.
		File Obj = new File("myfile.txt");
		if (Obj.delete()) {
			System.out.println("The deleted file is : " + Obj.getName());
		} else {
			System.out.println("Failed in deleting the file.");
		}

	}

}
