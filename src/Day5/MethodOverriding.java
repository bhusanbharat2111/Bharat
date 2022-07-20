package Day5;

class Four_G {
	void peakDataRate() {
		System.out.println("Peak Data Rate of 4g network is 1Gbps");
	}
}

class Five_G extends Four_G {
	void peakDataRate() {
		System.out.println("Peak Data Rate of 5g network is 10Gbps");
	}
}
public class MethodOverriding {
	
	public static void Package() {
		System.out.println("This is the method of MethodOverriding class, which is present inside Day5 package");
	}

	public static void main(String[] args) {
		Five_G f=new Five_G();
		f.peakDataRate();

	}

}
