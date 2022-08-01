package training.string;

public class OccurrenceOfCharacter {
	static String Display(String string) {
		String string2 = "";
		int index = 0;
		char[] array = string.toCharArray();

		while (index < string.length()) {
			char char1 = array[index];
			int count = 1;
			while (true) {
				index++;
				if (index < array.length && array[index] == char1) {
					count++;
				} else {
					break;
				}
			}
			string2 += count + "" + char1 + " ";
		}
		return string2;
	}
}