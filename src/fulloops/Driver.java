package fulloops;

public class Driver {
	Driver(Vehicle v) {
		System.out.println("Features-->");
		v.start();
		v.stop();
		v.fuelType();
		if (v instanceof Platina) {
			((TwoWheeler) v).seatCapacity();
		} // downcasting
		else if (v instanceof HondaShine) {
			((HondaShine) v).seatCapacity();
		} // downcasting
		else if (v instanceof I20) {
			((I20) v).seatCapacity();
		} // downcasting
		else if (v instanceof Audi) {
			((Audi) v).seatCapacity();
		} // downcasting
	}
}
