import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 7501769292052859241L;
	
	private int id;
	private String name;
	
	Person(int id, String name){
	this.id = id;
	this.name = name;
		
	}
	@Override
	public String toString() {
		return "Person id: " + id + "  Name: " + name;
	}
	
}
