class Student{

	private String name;
	private int roll;
	private int age;

	public void setName(String name){
		this.name = name;
	}
	public void setRoll(int roll){
		this.roll = roll;
	}
	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return name;
	}

	public int getRoll(){
		return roll;
	}

	public int getAge(){
		return age;
	}
}
public class Encapsulate{
	public static void main(String[] args){
		Student s1 = new Student();

		s1.setName("Jack");
		s1.setAge(22);
		s1.setRoll(1);

		System.out.println("Your name is " + s1.getName() + "Your age and roll no is " + s1.getAge() + s1.getRoll());
	}
}

