class Area{
	int length;
	int breadth;

	Area(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public void getArea(){
		int area = length * breadth;
		System.out.println("Area: " + area);
	}
}

class Encapsulation1{
	public static void main(String[] args){
		Area rectangle = new Area(4, 5);
		rectangle.getArea();
	}
}

