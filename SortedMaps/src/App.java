import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();  // order is random
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>(); // order is same as we put 
		Map<Integer, String> tm = new TreeMap<Integer, String>(); // natural sorted order of keys     
		
		testMap(hm);
		testMap(lhm);
		testMap(tm);
		
	}
	
	public static void testMap(Map<Integer, String> map){
		map.put(9,"Dinasaurs");
		map.put(4,"Lion");
		map.put(6,"Zeebra");
		map.put(5,"Snake");
		map.put(3,"Cat");
		
		for(Integer key : map.keySet()) {
			
			String name = map.get(key);
			System.out.println(name);
			
		}
		System.out.println();
	}
	
}
