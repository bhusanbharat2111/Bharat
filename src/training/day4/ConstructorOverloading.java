package training.day4;

//Box class has three overloaded constructors
class Box {
	int height;
	int width;
	int length;

	Box() {
	}

	Box(int h, int w, int l) {
		height = h;
		width = w;
		length = l;
	}

	Box(int v) {
		height = v;
		width = v;
		length = v;
	}

	public String display() {
		return "Box [height=" + height + ", width=" + width + ", length=" + length + "]";
	}

}

public class ConstructorOverloading {

	// creating objects of Box class
	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(10, 20, 30);
		Box b3 = new Box(40);
		System.out.println(b1.display());
		System.out.println(b2.display());
		System.out.println(b3.display());
	}

}
