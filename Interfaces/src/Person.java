
public class Person implements Info{
	String name;

	public void greet() {
		System.out.println("Hello There");

	}

	public Person(String name) {
		this.name = name;
	}
	public void showInfo() {
		System.out.println("My name is: " + name);
	}
}
