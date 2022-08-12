package training.java8features;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		String[] arr = new String[5];
		arr[0] = "Subhra";
		arr[1] = "Sharda";
		System.out.println(arr[0].toUpperCase());
		Optional<String> stringone = Optional.ofNullable(arr[1]);
		System.out.println(stringone.isPresent());
		Optional<String> stringtwo = Optional.ofNullable(arr[2]);

		if (stringtwo.isPresent()) {
			System.out.println(stringtwo.get() + "To uppercase :" + stringtwo.get().toUpperCase());
		} else {
			System.out.println(stringtwo.orElse("Gireesh"));
		}

	}

}