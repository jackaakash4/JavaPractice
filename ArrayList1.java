import java.util.*;
import java.util.ArrayList;

class ArrayList1{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Jack");
		al.add("Aakash");

		System.out.println(al);

		al.add(1, "Mr.");

		System.out.println(al);
	}
}

