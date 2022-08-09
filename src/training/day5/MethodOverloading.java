package training.day5;

class Quadrilateral {
	int area(int l, int b) {
		System.out.println("It's a Rectangle");
		return l*b;
	}
	int area(int a) {
		System.out.println("It's a Square");
		return a*a;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Quadrilateral q;
		q=new Quadrilateral();
		System.out.println("Area is "+q.area(20));
		System.out.println("Area is "+q.area(10, 30));
	}

}
