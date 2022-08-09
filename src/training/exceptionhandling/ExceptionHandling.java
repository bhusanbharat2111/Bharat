package training.exceptionhandling;

import java.io.IOException;

public class ExceptionHandling {

	// throws, used to declare the exception
	public static void findFile() throws IOException {
		// throw, forcefully throws the exception
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