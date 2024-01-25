import java.util.List;
import java.util.ArrayList;

public class ArrayList{
	public static void main(String[] args){
		List<String> itemList = new ArrayList<String>();

		itemList.add("Jack");
		itemList.add("Aakash");
		itemList.add("is");
		itemList.add("good boy");

		System.out.println("Before operation: " + itemList);

		int size = itemList.size();

		System.out.println("The size of arraylist is: " + size);

	}
}

