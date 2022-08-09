package training.day5;

class Address {
	int streetNum;
	String city;
	String state;
	String country;
	Address(int street, String c, String st, String coun) {
		this.streetNum=street;
		this.city =c;
		this.state = st;
		this.country = coun;
	}
}

class Employee {
	int EmployeeID;
	String EmployeeName;
	Address EmployeeAddr;
	Employee(int ID, String name, Address addr) {
			this.EmployeeID=ID;
			this.EmployeeName=name;
			this.EmployeeAddr = addr;
	}
	void displaydata() {
		System.out.println("EmployeeID: "+EmployeeID);
		System.out.println("EmployeeName: "+EmployeeName);
		System.out.println("Street: "+EmployeeAddr.streetNum);
		System.out.println("City: "+EmployeeAddr.city);
		System.out.println("State: "+EmployeeAddr.state);
		System.out.println("Counrty: "+EmployeeAddr.country);
	}
}

class Student {
	String name;
	int rollNum;
	Address Stdaddr;
	Student(String s,int r,Address Stdaddr) {
		this.name=s;
		this.rollNum=r;
		this.Stdaddr=Stdaddr;
	}		
	void Displaydata() {		
		System.out.println("Rollnum: "+rollNum);
		System.out.println("Name: "+name);
		System.out.println("Street: "+Stdaddr.streetNum);
		System.out.println("City: "+Stdaddr.city);
		System.out.println("State: "+Stdaddr.state);
		System.out.println("Counrty: "+Stdaddr.country);
	}
}

public class Aggregation {

	public static void main(String[] args) {
		Address ad = new Address(2, "Bangalore", "Karnataka", "India");
		Employee obj = new Employee(1, "Suraj", ad);
		obj.displaydata();
		System.out.println("-----------------");
		Address ad1=new Address(3,"Dharwad","Karnataka","India");
		Student std=new Student("Rahul",420,ad1);
		std.Displaydata();
	}

}
