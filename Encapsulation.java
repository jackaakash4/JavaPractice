class Person{
	private String name;
	private int age;


	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}
}

public class Encapsulation{
	public static void main(String[] args){
		Person p1 = new Person();
		p1.setName("Aakash");
		p1.setAge(22);
		
		System.out.println("Your name is " + p1.getName() + " Your age is " + p1.getAge());
	}
}


