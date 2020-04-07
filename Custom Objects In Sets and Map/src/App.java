import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Person {
	private int id;
	private String name;
	
	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public String toString() {
		return "{Id: "+ id + ", Name - " + name+"}";
	}
}

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2,"Mike");
		Person p4 = new Person(1, "Sue");
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		
		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);
		
		for(Person key : map.keySet()) {
			System.out.println(key +", " + map.get(key));
		}
		
		Set<Person> set = new LinkedHashSet<Person>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
		
	}

}
