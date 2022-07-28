package fulloops;

public class Platina extends TwoWheeler {
	@Override
	public void start() {
		System.out.println("Kick start");
	}

	@Override
	public void stop() {
		System.out.println("Turn off the key to stop the engine");
	}

}
