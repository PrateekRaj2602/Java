import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writting Objects");

		Person mike = new Person(543, "Mike");
		Person soe = new Person(123, "Soe");
		
		System.out.println(mike);
		System.out.println(soe);
		
		try(FileOutputStream fs = new FileOutputStream("people.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			
			os.writeObject(mike);
			os.writeObject(soe);
			
			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
