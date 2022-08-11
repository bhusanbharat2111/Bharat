package training.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferr1 = null;
		try (FileWriter fw = new FileWriter("TextFile2.txt", true); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("\nNew Text Appended. ");

			bw.write("Appending successfull!!!");
			bufferr1 = new BufferedReader(new FileReader("TextFile2.txt"));

			System.out.println(bufferr1.readLine());
			String Details = null;
			while ((Details = bufferr1.readLine()) != null) {
				System.out.println(Details);
			}
		} catch (IOException e) {
			System.out.println("Invalid Input!!");
		} finally {
			bufferr1.close();
		}
	}
}
