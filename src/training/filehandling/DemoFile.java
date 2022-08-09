package training.filehandling;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoFile {
	public static void main(String[] args) throws IOException {
		BufferedWriter buffer = new BufferedWriter(
				new FileWriter("D:\\NewProject1\\src\\training\\filehandling\\TextFile2.txt"));
		/**
		 * Using Write method to insert data into the file.
		 */
		buffer.write("hello");
		buffer.write("\nFile has been created successfully");

		buffer.close();

		BufferedReader bufferr = new BufferedReader(
				new FileReader("D:\\NewProject1\\src\\training\\filehandling\\TextFile2.txt"));
		/**
		 * Using readLine() method to get the data present in the file.
		 */
		System.out.println(bufferr.readLine());
		String Details = null;
		while ((Details = bufferr.readLine()) != null) {
			System.out.println(Details);
		}
		bufferr.close();
	}
}
