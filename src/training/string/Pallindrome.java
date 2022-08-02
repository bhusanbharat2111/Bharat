package training.string;

public class Pallindrome {
	static boolean isPallindrome(String string) {
		string = string.toLowerCase();
		int index = 0;
		int index1 = string.length() - 1;

		while (index < index1) {
			if (string.charAt(index) != string.charAt(index1)) {
				return false;
			}
			index++;
			index1--;
		}
		return true;
	}
}