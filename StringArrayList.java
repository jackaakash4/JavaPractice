import java.util.ArrayList;
public class StringArrayList{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<>();

		al.add("Jack");
		al.add(" is good boy");

		al.add(1, "Aakash");

		System.out.println(al);

		//setting element in 1st index
		al.set(1, "Shrestha");
		System.out.println("After setting i.e. set() : " + al);

		//removing element 
		//removing from index
		al.remove(1);

		System.out.println("After removing 1st index element "+ al);
	
	}

}

