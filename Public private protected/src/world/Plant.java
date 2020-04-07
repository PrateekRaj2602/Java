package world;

public class Plant {

	//  Bad practice
	public String name;
	
	// Acceptable practice --- It's final
	public final static int ID = 7;
	
	
	private String type;
	
	protected String size;
	
	int height;   // Package level visibility
	
	public Plant(){
		name = "Freddy";
		type  = "plant";
		size = "medium";
		height = 19;
	}
}
