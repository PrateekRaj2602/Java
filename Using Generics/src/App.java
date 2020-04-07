import java.util.ArrayList;
import java.util.HashMap;

class Robot {
	
}

public class App {
	
	public static void main(String args[]) {
	
		////////// Before Java 5 //////////////
		
		ArrayList list = new ArrayList();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Banna");
		
		String fruit = (String)list.get(1); 
		System.out.println(fruit);
		
		/////Modern style//////////
		
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Tiger");
		a.add("Fish");
		a.add("Camel");
		
		String animal = a.get(2);
		System.out.println(animal);
		
		////There can be more than one argument/////
		HashMap<Integer, String> b = new HashMap<Integer, String>();
		
		///////Java 7 Style///////////////
		
		ArrayList<String> s = new ArrayList<>(); 
		
		ArrayList<Robot> k = new ArrayList<>(); 
		
		
		
		
	}

}
