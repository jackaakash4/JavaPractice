import java.util.ArrayList;
public class StringArrayList{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<>();

		al.add("Jack");
		al.add(" is good boy");

		al.add(1, "Aakash");

		System.out.println(al);
	}
}

