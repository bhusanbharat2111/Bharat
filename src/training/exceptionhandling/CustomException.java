package training.exceptionhandling;

public class CustomException extends Exception{
	
	public CustomException() {
		super();	
	}
	public CustomException(String errorMessage) {
		super(errorMessage);
	}

}
