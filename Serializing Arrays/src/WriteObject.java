import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
	public static void main(String[] args) {
		System.out.println("Writting");

		Person[] people = { new Person(1, "Harry"), new Person(3, "Ron"), new Person(5, "Herminee") };
		ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

		try (FileOutputStream fo = new FileOutputStream("ex.bin")) {
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(people);
			
			oo.writeObject(peopleList);
			
			int n= peopleList.size();
			oo.writeInt(n);
			
			for(Person person:peopleList ) {
				oo.writeObject(person);
			}
			
			oo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
