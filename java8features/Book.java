package training.java8features;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	private String bname;
	private int bpages;
	private double bprice;
	private int nbooks;
}
