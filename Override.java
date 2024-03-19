//Method overriding
class Demo{
	void print(){
		System.out.println("Super class");
	}
}

class Subclass1 extends Demo{
	void print(){
		System.out.println("Sub class 1");
	}
}

class Subclass2 extends Demo{
	void print(){
		System.out.println("Sub class 2");
	}
}

public class Override{
	public static void main(String[] args){
		Demo exp1 = new Subclass1();
		Demo exp2 = new Subclass2();
		exp1.print();
		exp2.print();
	}
}

