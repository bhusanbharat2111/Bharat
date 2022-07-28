package fulloops;

import java.util.Scanner;

public class FullOOPs {
	public static void main(String[] args) {
		Vehicle v = new Platina(); // upcasting or late binding
		Owner o = new Owner("Bharat", "7978522836", v, "OD07 Z 1292");
		Vehicle v1 = new HondaShine(); // upcasting or late binding
		Owner o1 = new Owner("Subhra", "707864283", v1, "WB01 AK 5481");
		Vehicle v2 = new I20(); // upcasting or late binding
		Owner o2 = new Owner("Sharda", "707864283", v2, "DL07 AJ 3273");
		Vehicle v3 = new Audi(); // upcasting or late binding
		Owner o3 = new Owner("Girish", "707864283", v3, "KA09 MB 5553");
		Scanner sc = new Scanner(System.in);
		System.out.println("Old Vehicles available here:");
		System.out.println("1. Platina \n2. Honda Shine\n3. I20\n4. Audi ");
		System.out.print("Enter the vehicle number listed up that you want to buy: ");
		int n = sc.nextInt();
		System.out.println();

		switch (n) {
		case 1:
			System.out.println("Owner details......");
			System.out.println("Name: " + o.getName());
			System.out.println("Contact Number: " + o.getPhnNo());
			System.out.println("Vehicle Number: " + o.getVehicleNumber());
			new Driver(v);
			break;
		case 2:
			System.out.println("Owner details......");
			System.out.println("Name: " + o1.getName());
			System.out.println("Contact Number: " + o1.getPhnNo());
			System.out.println("Vehicle Number: " + o1.getVehicleNumber());
			new Driver(v1);
			break;
		case 3:
			System.out.println("Owner details......");
			System.out.println("Name: " + o2.getName());
			System.out.println("Contact Number: " + o2.getPhnNo());
			System.out.println("Vehicle Number: " + o2.getVehicleNumber());
			new Driver(v2);
			break;
		case 4:
			System.out.println("Owner details......");
			System.out.println("Name: " + o3.getName());
			System.out.println("Contact Number: " + o3.getPhnNo());
			System.out.println("Vehicle Number: " + o3.getVehicleNumber());
			new Driver(v3);
			break;
		default:
			System.out.println("Please refer the listed vehicle only which are availabe here");
		}
		sc.close();
		System.out.println("\nThank you for choosing this site (o~o)");
	}
}
