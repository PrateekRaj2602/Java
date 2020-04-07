import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
public static void main (String[] args) {
	File file = new File("ex.txt");

        try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
        	
		br.write("This is First Line");
		br.newLine();
		br.write("This is Second Line");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
