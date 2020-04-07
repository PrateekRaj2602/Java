import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
public static void main (String[] args) {
	File fl = new File("C:\\Users\\RAJ\\Desktop\\example.txt");
    FileReader fr;
	BufferedReader br = null;
	try {

		fr = new FileReader(fl);
        br = new BufferedReader(fr);
        String line;
        
        while((line = br.readLine())!= null ) {
        	System.out.println(line);
        }
        
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	finally{
		try {
		br.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}

	
	
	
}
}
