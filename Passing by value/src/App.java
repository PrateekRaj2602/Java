
public class App {

	public static void main(String[] args) {
		
		//========================================
		int value = 5;
		System.out.println("1.Value: "+value);
		
		App app = new App();
		app.show(value);
		
		System.out.println("4.Value: "+value);
		
		//=========================================
		System.out.println();
		
	    Person person = new Person("Bob");
		
		System.out.println("1.Person: "+person);
		app.show(person);
		
		System.out.println("4.Person: "+person);
		
	}

	public void show(int value) {
		System.out.println("2.Value: "+value);
		
		value = 7;
		
		System.out.println("3.Value: "+value);
		
	}
	
	public void show(Person person) {
		System.out.println("2.Person: "+person);
		
		person.setName("Mike");                          /// impo. concept , forgot see video 17:00;
		
		person = new Person("Sue");
		
		System.out.println("3.Person: "+person);
	}
	
	
}
