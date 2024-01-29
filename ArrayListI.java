import java.util.ArrayList;

public class ArrayListI{
	public static void main(String[] args){
		int size = 4;
		//Declaring the ArrayList with initial size n
		ArrayList<Integer> array1 = new ArrayList<Integer>(size);
		
		//Declaring ArrayList
		ArrayList<Integer> array2 = new ArrayList<Integer>();

		System.out.println("Array 1: " + array1);
		System.out.println("Array 2: " + array2);

		for(int i= 0; i < size; i++){
			array1.add(i);
			array2.add(i);
		}

		System.out.println("Array 1 after append: " + array1);
		System.out.println("Array 2 after append: " + array2);
	}
}

		
