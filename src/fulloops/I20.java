package fulloops;

public class I20 extends FourWheeler {
	@Override
	public void start() {
		System.out.println("Key start");
	}

	@Override
	public void stop() {
		System.out.println("Turn off the key to stop the engine");
	}

	@Override
	public void fuelType() {
		System.out.println("Petrol");
	}

	public void seatCapacity() {
		System.out.println("Maximum four person can sit");
	}
}
