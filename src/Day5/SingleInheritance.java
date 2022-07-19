package Day5;

class Vehicle {
	void start() {
		System.out.println("Vehicle Started");
	}
	void stop() {
		System.out.println("Vehicle Stopped");
	}
}

class FourWheeler extends Vehicle {
	void move() {
		System.out.println("FourWheleer moving");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {
		FourWheeler f1=new FourWheeler();
		f1.start();
		f1.move();
		f1.stop();
	}
}
