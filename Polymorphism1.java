class Demo{
	static int Multiply(int a, int b){
		return a * b;
	}

	static int Multiply(int a, int b, int c){
		return a * b * c;
	}
}

class Polymorphism1{

	public static void main(String[] args){
		System.out.println(Demo.Multiply(1, 2, 4));
		System.out.println(Demo.Multiply(9, 8));
	}
}

