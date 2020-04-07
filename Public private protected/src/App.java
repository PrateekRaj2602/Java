import world.Plant;

/*
 * public -- form anywhere
 * private -- only within same class
 * protected -- same class, subclass, same package
 * no modifier -- same package only
 */
public class App {

	public static void main(String args[]) {
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		System.out.println(plant.ID);
		
		// Won't work -- type is private
		//System.out.println(plant.type);
		
		
		//size is protected;App is not in the same package as plant
		//Won't Work
		//System.out.println(plant.size);
		
		//Won't work; App and Plant is in different packages,height has package level visibility.
		//System.out.println(plant.height);
	}
	
	
	
	
}
