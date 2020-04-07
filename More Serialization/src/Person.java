import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = -1150098568783815480L;
	
	
	private transient int id;  // We use transient when we do not want to serialize that field
	                           //and default value of that field will appear.It's not true with your local 
	                           //variable within your method.But top level fields in your class will be given a default 
	                           //value and for integers it is 0 
	
	private String name;
	
	private static int count;  // static fields belong to class and they are not serialized because static 
	                           // field belongs to the class not to individual objects and count here is a class level field 
	                          // so it's gonna have default value = 0
	
	
	public Person() {
		System.out.println("Default constructor");
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
		
		System.out.println("Two-argument constructor");
		
	}
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "], count is: " + count;
	}

	

	
}
