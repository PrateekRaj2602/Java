import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class stringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int len1 = o1.length();
		int len2 = o2.length();

		if (len1 > len2) {
			return 1;
		}
		if (len2 > len1) {
			return -1;
		}

		return 0;
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);
	}

}

public class App {

	public static void main(String[] args) {

		/////////////// Sorting strings////////////////////
		List<String> animals = new ArrayList<>();

		animals.add("Zeebra");
		animals.add("Cat");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Lion");
		animals.add("Leopard");

		// Collections.sort(animals); // sorting in natural order
		// Collections.sort(animals, new stringLengthComparator()); //To use Comparator we need to supply instance of it
		                                                            //Sorting wrt length
		Collections.sort(animals, new ReverseAlphabeticalComparator()); // To use Comparator we need to supply instance of it
		                                                                //Sorting in reverse natural order

		for (String animal : animals) {
			System.out.println(animal);
		}

		////////////// Sorting integers///////////////////
		List<Integer> numbers = new ArrayList<>();

		numbers.add(23);
		numbers.add(7);
		numbers.add(47);
		numbers.add(19);
		numbers.add(5);

		// Collections.sort(numbers); //Sorting in natural order
		Collections.sort(numbers, new Comparator<Integer>() {// Sorting in reverse natural order
																// by anonymous class

			@Override
			public int compare(Integer num1, Integer num2) {

				return -num1.compareTo(num2);
			}

		});

		for (Integer i : numbers) {
			System.out.println(i);
		}

		///////////////// Sorting arbitrary objects//////////////////

		List<Person> people = new ArrayList<>();

		people.add(new Person(1, "Harry"));
		people.add(new Person(2, "Prateek"));
		people.add(new Person(3, "Herminy"));
		people.add(new Person(4, "Amyra"));

		
		///Sort in order of name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
				
			}
			
		});
		for (Person person : people) {
			System.out.println(person);
		}
		System.out.println("\n");

		///Sort in order of id
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getId() > o2.getId()) {
					return 1;
				}
				if(o1.getId() < o2.getId()) {
					return -1;
				}
				return 0;
			}
			
		});
		for (Person person : people) {
			System.out.println(person);
		}
		
	}
}
