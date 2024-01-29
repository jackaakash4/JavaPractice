import java.util.ArrayList;
public class ArrayListIteration{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<>();

		al.add("Jack");
		al.add("Aakash");
		al.add("is a good boy");

		for(int i = 0; i < al.size(); i++){
			System.out.println(al.get(i) + " " );
		}

		System.out.println();

		//using foreach loop

		for(String str: al){
			System.out.println(str + " ");
		}
	}
}


