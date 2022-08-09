package training.exceptionhandling;

//declaring a customException class that extends exception class
public class CustomException extends Exception {

	// non- parameterized constructor
	public CustomException() {
		super();
	}

	// parameterized constructor
	public CustomException(String errorMessage) {
		super(errorMessage);
	}

}
