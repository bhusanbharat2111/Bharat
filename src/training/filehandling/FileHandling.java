package training.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// created a object of File class and given the path
		File f = new File("D:\\NewProject1\\src\\training\\filehandling\\Bharat.txt");
		// checking if the file is present or not
		if (f.createNewFile()) {
			System.out.println("Bharat.txt <- Successfully created");
		} else {
			System.out.println("Bharat.txt<- File already exists");
		}

		// writing in the file
		FileWriter fw = new FileWriter("D:\\NewProject1\\src\\training\\filehandling\\Bharat.txt");
		fw.write("Anything - used to refer to a thing, no matter what.\"nobody was saying anything\""
				+ "used for emphasis." + "\"I was ready for anything\"used to indicate a range."
				+ "he trains anything from seven to eight hours a day");
		fw.close();
		// printing the data available in that file
		Scanner sc = new Scanner(f);
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			System.out.println(line);
		}
		sc.close();
//		if (f.delete()) {
//			System.out.println("I have deleted: " + f.getName());
//		} else {
//			System.out.println("Some problem occurred while deleting the file");
//		}
	}

}
