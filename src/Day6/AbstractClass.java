package Day6;

abstract class Car {
	void type() {
		System.out.println("Four Wheeler");
	}
	abstract void gear();
}

class ManualGear extends Car {
	void gear() {
		System.out.println("It have 5 or 6 gear channel");
	}
}

class AutoGear extends Car {
	void gear() {
		System.out.println("It does not have gear channel");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		ManualGear m=new ManualGear();
		m.type();
		m.gear();
		System.out.println("-------------------------------");
		AutoGear a=new AutoGear();
		a.type();
		a.gear();

	}

}
