package Day3;

class NoArgument{
	String trip;
	
	NoArgument(){
		trip="GOA";
	}
}
public class NoArgumentConstructor {
	public static void main(String[] args) {
		NoArgument n1=new NoArgument();
		System.out.println(n1.trip);
		NoArgument n2=new NoArgument();
		System.out.println(n2.trip);

	}
}
