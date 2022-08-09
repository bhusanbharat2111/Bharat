package fulloops;

public class Owner {
	//encapsulation
			private String name;
			private String phnNo;
			private Vehicle vehicleType;
			private String vehicleNumber;
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getPhnNo() {
				return phnNo;
			}
			public void setPhnNo(String phnNo) {
				this.phnNo = phnNo;
			}
			public Vehicle getVehicleType() {
				return vehicleType;
			}
			public void setVehicleType(Vehicle vehicleType) {
				this.vehicleType = vehicleType;
			}
			public String getVehicleNumber() {
				return vehicleNumber;
			}
			public void setVehicleNumber(String vehicleNumber) {
				this.vehicleNumber = vehicleNumber;
			}
			
			Owner(String n, String p, Vehicle v, String vn){
				setName(n);
				setPhnNo(p);
				setVehicleType(v);
				setVehicleNumber(vn);
			}

	}