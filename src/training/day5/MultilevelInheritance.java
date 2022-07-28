package training.day5;

class I20 extends FourWheeler {
	void fuel() {
		System.out.println("I20 needs petrol");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		I20 f1=new I20();
		f1.fuel();
		f1.start();
		f1.move();
		f1.stop();

	}

}
