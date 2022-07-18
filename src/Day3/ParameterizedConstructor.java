package Day3;

class Parameterized {
	String empName;
	int empID;
	
	Parameterized(String s, int n){
		empName=s;
		empID=n;
	}

	public void display() {
		System.out.println("[empName=" + empName + ", empID=" + empID + "]");
	}
	
}
public class ParameterizedConstructor {
	public static void main(String[] args) {
		Parameterized p1=new Parameterized("Bharat",641);
		Parameterized p2=new Parameterized("Girish",649);
		p1.display();
		p2.display();
	}
}
