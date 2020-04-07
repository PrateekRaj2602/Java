import java.util.Objects;

public class Person implements Comparable<Person>{

	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

public Person(String name) {
	super();
	this.name = name;
}

@Override
public int hashCode() {
	return Objects.hash(name);
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
	return Objects.equals(name, other.name);
}

@Override
public String toString() {
	return "Person [name=" + name + "]";
}

@Override
public int compareTo(Person person) {
	int len1 = name.length();
	int len2 = person.name.length();
	
	if(len1 > len2) {
		return 1;
	}if(len1 < len2) {
		return -1;
	}
	return name.compareTo(person.name);
}

	
}
