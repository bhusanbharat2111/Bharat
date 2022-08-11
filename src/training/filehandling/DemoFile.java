package training.filehandling;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DemoFile {
	public static void main(String[] args) throws IOException {
		BufferedWriter buffer = null;
		BufferedReader bufferr = null;
		try {
			buffer = new BufferedWriter(new FileWriter("files(filehandling)\\TextFile2.txt"));
			/**
			 * Using Write method to insert data into the file.
			 */
			buffer.write("hello");
			buffer.write("\nFile has been created successfully");

			bufferr = new BufferedReader(new FileReader("files(filehandling)\\TextFile2.txt"));
			/**
			 * Using readLine() method to get the data present in the file.
			 */
			System.out.println(bufferr.readLine());
			String Details = null;
			while ((Details = bufferr.readLine()) != null) {
				System.out.println(Details);
			}
		} catch (Exception e) {
			System.out.println("Invalid Input!!");
		} finally {
			buffer.close();
			bufferr.close();
		}
	}
}
