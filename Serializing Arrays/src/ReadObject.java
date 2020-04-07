import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
public static void main(String[] args) {
	System.out.println("Reading");
	
	try(FileInputStream fi = new FileInputStream("ex.bin")){
		ObjectInputStream oi = new ObjectInputStream(fi);
		Person[] people = (Person[])oi.readObject();
		
		@SuppressWarnings("unchecked")
		ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();		
		
	    for(Person person: people) {
	    	System.out.println(person);
	    }
		
	    System.out.println();
	    
	    for(Person person: peopleList) {
	    	System.out.println(person);
	    }
	    
	    System.out.println();
	    
	    int n = oi.readInt();
	    
	    for(int i = 0; i<n; i++) {
	    	Person person = (Person)oi.readObject();
	    	System.out.println(person);
	    	
	    }
	    
	    oi.close();
	    
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
