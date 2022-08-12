package training.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsStream {

	public static void main(String[] args) {
		// Creating different types of book list
		Book[] booklist = { new Book("Corejava", 200, 250.00, 10), new Book("Advancejava", 150, 350.00, 25),
				new Book("Javascript", 150, 200.00, 30), new Book("Html", 100, 100.00, 15),
				new Book("React", 300, 500.00, 40), new Book("Ruby", 500, 650.00, 60) };
		// Adding book list into list collection
		List<Book> list = Arrays.asList(booklist);
		// Printing statement
		System.out.println("Book's list: \n" + list);
		// Here counting the types of book present in the book list
		Long typesofBook = list.stream().collect(Collectors.counting());
		System.out.println(typesofBook);
		// Finding total number of books in the list
		int totalBooks = list.stream().collect(Collectors.summingInt((p) -> p.getNbooks()));
		System.out.println(totalBooks);
		// Total price of books
		double totalPrice = list.stream().collect(Collectors.summingDouble((p -> p.getBprice())));
		System.out.println(totalPrice);

	}

}
