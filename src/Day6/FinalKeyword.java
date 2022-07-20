package Day6;

public class FinalKeyword {
	
	private final double pi=3.141592653589793238;
	
	private int areaCircle(int a) {
		return (int)(pi*a*a);
	}
	
	public static void main(String[] args) {
		System.out.println((new FinalKeyword()).areaCircle(7));	
	}

}
