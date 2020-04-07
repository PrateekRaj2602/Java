class Person {
	private int id;
	private String name;

	
	public Person(int id, String name) {

		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class App {
	public static void main(String[] args) {
	Person person1 = new Person(5, "Bob");
	Person person2 = new Person(5, "Bob");
	
	System.out.println(person1 == person2);
	System.out.println(person1.equals(person2));
	System.out.println();
	
	
	Double value1 = 7.2;
	Double value2 = 7.2;
	System.out.println(value1 == value2);
	System.out.println(value1.equals(value2));
	System.out.println();
	
	Integer num1 = 6;
	Integer num2 = 6;
	System.out.println(num1 == num2);
	System.out.println(num1.equals(num2));
	System.out.println();
	
	String name1 = "Hello";
	String name2 = "Hello";
	System.out.println(name1==name2);
	System.out.println(name1.equals(name2));
	System.out.println();
	
	String text1 = "example";
	String text2 = "exampleabc".substring(0, 7);
	System.out.println(text1 == text2);
	System.out.println(text1.equals(text2));
	
	
	}

}
