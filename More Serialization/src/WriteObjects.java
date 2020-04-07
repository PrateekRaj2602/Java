import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writting");
		
		Person person = new Person(5,"Amyra");
		Person.setCount(88);
		
		
		try(ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Txt.txt"))){
			oo.writeObject(person);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
