import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		System.out.println("Enter your name: ");
		Scanner input1 = new Scanner(System.in);
		String name = input1.nextLine();
		System.out.println("Enter your age: ");
		Scanner input2 = new Scanner(System.in);
		int age = input2.nextInt();

		System.out.println("Your name is: " + name + " and your age is: " + age);
	}
}

