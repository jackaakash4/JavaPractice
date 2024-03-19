//Base class
class Bicycle{
	public int gear;
	public int speed;

	public Bicycle(int gear, int speed){
		this.gear = gear;
		this.speed = speed;
	}

	public void applyBrake(int decrement){
		speed -= decrement;
	}

	public void speedUp(int increment){
		speed += increment;
	}
	
	public String toString(){
		return ("No. of gears is " + gear + "\n" + "Speed of bicycle is " + speed);
	}
}

//Derived Class
//

class MountainBike extends Bicycle{
	public int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight){
		super(gear, speed);
		this.seatHeight = seatHeight;
	}

	public void setHeight(int newValue){
		seatHeight = newValue;
	}

	@Override public String toString(){
		return (super.toString() + " seat height is " + seatHeight);
	}
}
public class Inheritance{
	public static void main(String[] args){
		MountainBike m1 = new MountainBike(3, 100, 25);
		System.out.println(m1.toString());
	}

}
