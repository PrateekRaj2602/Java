import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(2, "Two");
		map.put(7, "Seven");
		map.put(5, "Five");
		map.put(9, "Nine");
		map.put(1, "One");

		String text = map.get(9);

		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String name = entry.getValue();

			System.out.println(key + ": " + name);
		}

	}
}
