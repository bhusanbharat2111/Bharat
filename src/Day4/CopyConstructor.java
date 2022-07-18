package Day4;

class Triangle {
	int length;
	Triangle() {
		length=10;
	}
	Triangle(Triangle t) {
		length=t.length;
	}
	
}
public class CopyConstructor {

	public static void main(String[] args) {
		Triangle t1=new Triangle();
		System.out.println(t1.length);
		Triangle t2=new Triangle(t1);
		System.out.println(t2.length);

	}

}
