import java.util.Scanner;
public class TwoDArrayInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = input.nextInt();

		System.out.println("Enter the number of columns: ");
		int column = input.nextInt();

		int[][] TwoDArray = new int[row][column];

		for(int i = 0; i < row; i++){
			for(int j = 0; j < row; j++){
				System.out.println(TwoDArray[i][j] = (i + 1) * (j + 1));
			}
		}
	}
}

