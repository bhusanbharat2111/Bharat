package fulloops;

public class HondaShine extends TwoWheeler {
	@Override
	public void start() {
		System.out.println("Kick start / self start");
	}

	@Override
	public void stop() {
		System.out.println("Turn off the key to stop the engine");
	}
}
