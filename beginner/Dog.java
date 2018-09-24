package beginner;

public class Dog extends Mammal{
	
	int a=15;
	
	public void walk() {
		super.walk();
		System.out.println("All animals can walk but the dog can also runs.");
	}
	
	public void bark() {
		System.out.println("Dog barks.");
	}
	
	public static void main(String[] args) {
		
		//Animal A = new Animal();
		//Mammal M = new Mammal();
		//Animal d = new Dog();	
		Dog d= new Dog();
		d.feed();
		d.eat();
		d.walk();
		//A.walk();
		d.bark();
		
		System.out.println(d instanceof Animal);
		System.out.println(d.a);
	}

}
