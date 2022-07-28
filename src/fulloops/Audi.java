package fulloops;

public class Audi extends FourWheeler {
	@Override
	public void start() {
		System.out.println("Push button start");
	}

	@Override
	public void stop() {
		System.out.println("Push button to stop the engine");
	}

	@Override
	public void fuelType() {
		System.out.println("Diesel");
	}

	public void seatCapacity() {
		System.out.println("Maximum five person can sit");
	}
}
