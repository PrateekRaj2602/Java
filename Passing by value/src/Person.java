
public class Person {

	private String name;

	public String getName() {
		return name;
	}

	
	public Person(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
