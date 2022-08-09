package fulloops;

//abstract class
public abstract class TwoWheeler implements Vehicle {
	public void seatCapacity() {
		System.out.println("Maximum two person can sit");
	}

	@Override
	public void fuelType() {
		System.out.println("Petrol");
	}
}