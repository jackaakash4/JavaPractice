public class TwoDArray{
	public static void main(String[] args){
		int row = 4; 
		int column = 4;

		int[][] array = new int[row][column];

		int value = 1;
		for( int i = 0; i < row; i++){
			for (int j = 0; j < column; j++){
				array[i][j] = value;
				value++;
			}
		}

		System.out.println("The 2D array is: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				System.out.println(array[i][j] + " " );
			}
		}
	}
}

