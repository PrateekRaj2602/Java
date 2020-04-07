import world.Plant;

public class Grass extends Plant {

	
	public Grass() {
		//Won't work--Grass not in same package as Plant, Even though it's a subclass
		//System.out.println(palnt.height);
		
		
		//work because size is protected; Grass is a subclass of Plant
		System.out.println(size);

		
}
}
