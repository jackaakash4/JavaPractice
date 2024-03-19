abstract class Animal{
	private String name;

	public Animal(String name){
		this.name = name;
	}

	public abstract void makeSound();

	public String getName(){
		return name;
	}

}

class Dog extends Animal{

	public Dog(String name){
		super(name);
	}

	public void makeSound(){
		System.out.println(getName() + "bark");
	}

}

class Cat extends Animal{
	public Cat(String name){
		super(name);
	}

	public void makeSound(){
		System.out.println(getName() + "meow");
	}
}

public class Abstraction2{
	public static void main(String[] args){
		Animal d1 = new Dog("Jack");
		Animal c1 = new Cat("Puss");

		d1.makeSound();
		c1.makeSound();
	}
}


