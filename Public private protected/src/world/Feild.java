package world;

public class Feild {

	private Plant plant = new Plant();
	
	public Feild() {
		
		// size is Protected; Feild is in the same package as Plant; 
		System.out.println(plant.size);
		
	}
	
}
