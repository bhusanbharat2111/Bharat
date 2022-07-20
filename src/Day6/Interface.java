package Day6;

interface Animal {
	void eat();
	void speciality();	
}

class Dog implements Animal {
	public void eat() {
		System.out.println("Dog is a Non-Vegetarian");
	}
	public void speciality() {
		System.out.println("The area of cells in the brain that detect different smells is around 40 times larger in dogs than humans.");
	}
}

class Monkey implements Animal {
	public void eat() {
		System.out.println("Monkey is a Vegetarian");
	}
	public void speciality() {
		System.out.println("Monkeys are intelligent animals that are good at solving problems.");
	}
}

public class Interface {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.speciality();
		System.out.println("-----------------------");
		Monkey m=new Monkey();
		m.eat();
		m.speciality();

	}

}
