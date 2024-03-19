
public class OOP1{
		int roll;
		String name;
		float marks;
		public OOP1(int roll, String name, float marks){
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}
		public String getName(){
			return name;
		}
		public int getRoll(){
			return roll;
		}
		public float getMarks(){
			return marks;
		}
		@Override public String toString(){
			return("HI my name is " + this.getName() + " My Roll number is : " + this.getRoll()+ " Marks obtained is :" + this.getMarks());
		}


	public static void main(String[] args){
		OOP1 student1 = new OOP1(1, "Aakash", 90);
		System.out.println(student1.toString());
}
}
