import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);

	
		System.out.println("Before sorting list" + list);

		Collections.sort(list);
		System.out.println("After sorting list" + list);

	}
}

