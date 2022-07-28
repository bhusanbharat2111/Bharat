package training.day7;

public class GarbageCollector {
	
	public static void main(String[] args) {
        Employee a= new Employee("Bharat", 56);
        Employee b= new Employee("Subhra", 45);
        Employee c= new Employee("Sharda", 25);
        a.show();
        b.show();
        c.show();
        a.showNextId();
        Employee X = new Employee("Girish", 23);
        Employee Y = new Employee("Anirudh", 21);
        X.show();
        Y.show();
        Y.showNextId();
        X=null;
        Y=null;
        System.gc();
        //System.runFinalization();
        System.out.println("After deleting two object..........");
        a.showNextId();
	}
}

class Employee {
	   
    private int ID;
    private String name;
    private int age;
    private static int nextId = 1;
   
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.ID = nextId++;
    }
    public void showNextId() {
        System.out.println("Next employee id will be="+ nextId);
    }
    protected void finalize() {
        --nextId;
    }
	public void show() {
		System.out.println("Employee [ID=" + ID + ", name=" + name + ", age=" + age + "]");
	}
    
}