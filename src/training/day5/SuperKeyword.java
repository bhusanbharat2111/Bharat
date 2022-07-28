package training.day5;

class Phone {
	String nw;
	String color;
	void display() {
		System.out.println("Network: "+nw);
		System.out.println("Color: "+color);
	}
}

class CameraPhone extends Phone {
	int pixel;
	void display() {
		super.display();
		System.out.println("Pixel: "+pixel);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		CameraPhone c=new CameraPhone();
		c.nw="5g";
		c.color="black";
		c.pixel=48;
		c.display();
	}

}
