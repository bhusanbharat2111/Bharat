package training.day6;

class Josh {
	
	private int empId;
	private String name;
	private String emailId;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}	
	
}

public class Encapsulation {
	
	public static void main(String[] args) {
		Josh j1=new Josh();
		j1.setEmpId(641);
		j1.setName("Bharat");
		j1.setEmailId("bhusanbharat2111@gmail.com");
		System.out.println(j1.getName());
		System.out.println(j1.getEmpId());
		System.out.println(j1.getEmailId());
	}
	
}
