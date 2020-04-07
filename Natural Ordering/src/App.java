import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		SortedSet<Person> set = new TreeSet<>();
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);
		
	}

	public static void addElements(Collection<Person> col) {
		col.add(new Person("Sue"));
		col.add(new Person("Harry"));
		col.add(new Person("Raj"));
		col.add(new Person("Amyra"));
		col.add(new Person("Kane"));
		
	}
	
	public static void showElements(Collection<Person> col) {
		for(Person person : col) {
			System.out.println(person);
		}
	}
	
}
