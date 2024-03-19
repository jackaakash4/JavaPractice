import java.util.Scanner;
public class PrimitivesInputI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = input.nextLine();

		System.out.println("Enter your age: ");
		int age = input.nextInt();

		System.out.println("Are you married:(true or false) ");
		boolean isMarried = input.nextBoolean();

		System.out.println("Your name is " + name + ". You are " + age + " years old." + "You are married: " + isMarried);
	}
}

