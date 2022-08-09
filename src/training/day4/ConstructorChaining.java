package training.day4;

class Book {
	String title;
	String author;

	Book(String s) {
		title = s;
	}

	Book(String s, String n) {
		// this(argument) statement calls the overloaded constructor of same class
		this(s);
		author = n;
	}

	// display() shows the values of Book class properties
	public String display() {
		return "Book [title= " + title + ", author= " + author + "]";
	}

}

public class ConstructorChaining {

	// main method creates object of Book class
	// and passing values of Book class properties at the same time
	public static void main(String[] args) {
		Book b = new Book("JAVA", "JAMES GOSLING");
		System.out.println(b.display());
	}

}
