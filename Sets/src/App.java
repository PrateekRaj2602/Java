import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
        
		//HashSet does not retain order
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedList remembers the order you added items in
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty at start");
			
		}
	
		set1.add("Snake");
		set1.add("Bear");
		set1.add("Tiger");
		set1.add("Lion");
		set1.add("Dog");
		
		if(set1.isEmpty()) {
			System.out.println("Set is empty at end");
			}
		
		System.out.println(set1);
		
		// Adding duplicate items does nothing
		set1.add("Lion");
		
		System.out.println(set1);
		
		//////////////// Iteration ////////////////
		for(String element : set1) {
			System.out.println(element);
		}
		
		
		//Does set contains a given item?
		if(set1.contains("Cat")){
			System.out.println("Set1 doesn't contains Cat");
		}
		
		if(set1.contains("Tiger")){
			System.out.println("Set1 contains Tiger");
		}
		
		System.out.println();
		
		
		
	/// set2 contains some common elements with set1, and some new
		
	Set<String> set2 = new TreeSet<String>();
		
		
		set2.add("Snake");
		set2.add("Bear");
		set2.add("Monkey");
		set2.add("Fish");
		set2.add("Girrafe");
		
		
		
	/////////////Intersection//////////////////////	
	Set<String> intersection = new TreeSet<String>(set1);	
	intersection.retainAll(set2);
	System.out.println(intersection);
	
	/////////////Difference ///////////////////////
	Set<String> difference = new TreeSet<String>(set2);
	difference.removeAll(set1);
	System.out.println(difference);
	
	}

	
	
}
