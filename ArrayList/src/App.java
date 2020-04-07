import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();

		// Adding
		num.add(10);
		num.add(100);
		num.add(50);

		// Retrieving
		System.out.println(num.get(2));

		// Iterating

		System.out.println("\nIteration #1 :");
		for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}

		// Removing Items(Csreful!)
		num.remove(num.size() - 1);

		// This is VERY slow
		num.remove(0);

		System.out.println("\nIteration #2 :");
		for (Integer k : num) {
			System.out.println(k);
		}

		// List Interface
		List<String> name = new ArrayList<String>();

	}

}
