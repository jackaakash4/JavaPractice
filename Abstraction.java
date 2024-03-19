abstract class Shape{
	String color;
	
	abstract double area();
	public abstract String toString();

	public Shape(String color){
		System.out.println("Constructor is called");
		this.color = color;
	}

	public String getColor(){
		return color;
	}

}

class Circle extends Shape{
	double radius;

	public Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}

	@Override double area(){
		return Math.PI * Math.pow(radius, 2);
	}

	@Override public String toString(){
		return "Circle color is " + super.getColor() + " Area of circle is : " + area();
	}

}

class Rectangle extends Shape{
	double length;
	double breadth;

	public Rectangle(String color, double length, double breadth){
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	@Override double area(){
		return length * breadth;
	}

	@Override public String toString(){
		return "Color of rectangle is " + super.getColor() + " And area of rectangle is " + area();
	}
}

public class Abstraction{
	public static void main(String[] args){
		Shape s1 = new Circle("Red", 4.5);
		Shape s2 = new Rectangle("Yellow", 4, 5);

		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}





