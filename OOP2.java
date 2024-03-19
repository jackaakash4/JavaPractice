public class OOP2{
	String name;
	int price;

	void set(String name, int price){
		this.name = name;
		this.price = price;
	}

	void get(){
		System.out.println("Name of product is " + this.name + " And price of it is " + this.price);
	}
	public static void main(String[] args){
		OOP2 computer = new OOP2();
		computer.set("MacBook", 1200);
		computer.get();
	}
}

