import java.util.Scanner;
public class PrimitivesInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your roll no: ");
		int rollno = input.nextInt();

		System.out.println("Your name: ");
		Scanner stringInput = new Scanner(System.in);
		String name = stringInput.nextLine();

		System.out.println("Is you married? ");
		Scanner boolInput = new Scanner(System.in);
		boolean isMarried = boolInput.nextBoolean();

		String printMarried = (isMarried) ? "Married" : "Not married";

		System.out.println("Your roll no is " + rollno);
		System.out.println("Your name is " + name);
		System.out.println(printMarried);
	}
}
