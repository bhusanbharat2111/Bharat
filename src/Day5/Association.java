package Day5;

class Car {
	String name;
	int carNumber;
	Car(String n, int i) {
		name = n;
		carNumber = i;
	}
}

class Owner extends Car {
	String ownerName;
	Owner(String name, String c, int i){
		super(c,i);
		this.ownerName=name;
	}
}

public class Association {
	 public static void main(String args[]) {
		 Owner o=new Owner("Bharat", "I20", 1292); 
		 System.out.println("Car Owner Name is "+o.ownerName);
		 System.out.println("Car Brand is "+o.name);
		 System.out.println("Car Number is "+o.carNumber);
	 }
}