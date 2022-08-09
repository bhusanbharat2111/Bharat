package fulloops;

import java.util.Scanner;


//interface
interface Vehicle {
	void start();
	void stop();
	void fuelType();
}

//abstract class
abstract class TwoWheeler implements Vehicle {
	public void seatCapacity() {
		System.out.println("Maximum two person can sit");
	}
	@Override 
	public void fuelType() {
		System.out.println("Petrol");
	}
}

class Platina extends TwoWheeler {
	@Override
	public void start() {
		System.out.println("Kick start");
	}
	@Override
	public void stop() {
		System.out.println("Turn off the key to stop the engine");
	}
}

class HondaShine extends TwoWheeler {
	@Override
	public void start() {
		System.out.println("Kick start / self start");
	}
	@Override
	public void stop() {
		System.out.println("Turn off the key to stop the engine");
	}
}

//abstract class
abstract class FourWheeler implements Vehicle{
	public abstract void start();
	public abstract void stop();
	public abstract void fuelType();
}

class I20 extends FourWheeler {
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

class Audi extends FourWheeler {
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

class Driver {	
	Driver(Vehicle v){			
		System.out.println("Features-->");
		v.start();
		v.stop();
		v.fuelType();
		if(v instanceof Platina) ((TwoWheeler) v).seatCapacity();				//downcasting
		else if(v instanceof HondaShine) ((HondaShine) v).seatCapacity();		//downcasting
		else if(v instanceof I20) ((I20) v).seatCapacity();						//downcasting
		else if(v instanceof Audi) ((Audi) v).seatCapacity();					//downcasting
	}
}


public class FullOOPs {
	public static void main(String[] args) {
		Vehicle v=new Platina();			//upcasting or late binding
		Owner o=new Owner("Bharat","7978522836",v,"OD07 Z 1292");
		Vehicle v1=new HondaShine();		//upcasting or late binding
		Owner o1=new Owner("Subhra","707864283",v1,"WB01 AK 5481");
		Vehicle v2=new I20();				//upcasting or late binding
		Owner o2=new Owner("Sharda","707864283",v2,"DL07 AJ 3273");
		Vehicle v3=new Audi();				//upcasting or late binding
		Owner o3=new Owner("Girish","707864283",v3,"KA09 MB 5553");
		Scanner sc=new Scanner(System.in);
		System.out.println("Old Vehicles available here:");
		System.out.println("1. Platina \n2. Honda Shine\n3. I20\n4. Audi ");
		System.out.print("Enter the vehicle number listed up that you want to buy: ");
		int n=sc.nextInt();
		System.out.println();
					
		switch(n) {
		case 1:System.out.println("Owner details......");
			System.out.println("Name: "+o.getName());
			System.out.println("Contact Number: "+o.getPhnNo());
			System.out.println("Vehicle Number: "+o.getVehicleNumber());
			new Driver(v); break;
		case 2: System.out.println("Owner details......");
			System.out.println("Name: "+o1.getName());
			System.out.println("Contact Number: "+o1.getPhnNo());
			System.out.println("Vehicle Number: "+o1.getVehicleNumber());
			new Driver(v1); break;
		case 3:System.out.println("Owner details......");
			System.out.println("Name: "+o2.getName());
			System.out.println("Contact Number: "+o2.getPhnNo());
			System.out.println("Vehicle Number: "+o2.getVehicleNumber());
			new Driver(v2); break;
		case 4:System.out.println("Owner details......");
			System.out.println("Name: "+o3.getName());
			System.out.println("Contact Number: "+o3.getPhnNo());
			System.out.println("Vehicle Number: "+o3.getVehicleNumber());
			new Driver(v3); break;
		default:System.out.println("Please refer the listed vehicle only which are availabe here");
		}
		sc.close();
		System.out.println("\nThank you for choosing this site (o~o)");
	}
}


