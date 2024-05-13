//interface is a collection of abstract methods and used to group related //methods with empty bodies.


interface Language{
	void getName(String name);
}

class ProgrammingLanguage implements Language{
	public void getName(String name){
		System.out.println("Your fav language is " + name);
	}
}

public class Interface{
	public static void main(String[] args){
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.getName("Java");
	}
}

