import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	/*
	 * ArrayList manages arrays internally [0][1][2][3][4][5] .....
	 */

	/*
	 * LinkedList consists of elements where each element has a reference to the
	 * previous and next element [0]->[1]->[2]->.... <- <-
	 */

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();

		doTimings("ArrayList", al);
		doTimings("LinkedList", ll);

	}

	private static void doTimings(String type, List<Integer> list) {

		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}

		long start = System.currentTimeMillis();

		/*
		 * // Adding in end for(int i = 0; i<1E5; i++) { list.add(i); }
		 */

		// Adding in starting
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}

		long end = System.currentTimeMillis();

		System.out.println("for " + type + " time in ms: " + (end - start));
	}

}
