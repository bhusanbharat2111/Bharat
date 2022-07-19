package Day5;

class Animal {
	void sound() {
		System.out.println("Every animal sounds");
	}
}

class Dog extends Animal {
	void action() {
		System.out.println("Dog cannot climb");
	}
}

class Monkey extends Animal {
	void Action() {
		System.out.println("Monkey can climb");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		d.action();
		System.out.println("----------------------------");
		Monkey m= new Monkey();
		m.sound();
		m.Action();

	}

}
