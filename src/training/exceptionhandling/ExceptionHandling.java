package training.exceptionhandling;

import java.io.IOException;

public class ExceptionHandling {
	public static void findFile() throws IOException {
		throw new IOException("File not found");
	}

	public static void main(String[] args) {
		try {
			findFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}