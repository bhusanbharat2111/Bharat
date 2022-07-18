package Day4;

class Book {
	String title;
	String author;
	
	Book(String s) {
		title=s;
	}
	
	Book(String s,String n) {
		this(s);
		author=n;
	}

	public String display() {
		return "Book [title= " + title + ", author= " + author + "]";
	}
	
	
}
public class ConstructorChaining {
	
	public static void main(String[] args) {
		Book b=new Book("JAVA","JAMES GOSLING");
		System.out.println(b.display());
	}

}
