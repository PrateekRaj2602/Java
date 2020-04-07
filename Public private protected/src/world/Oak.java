package world;

public class Oak extends Plant {
	
	public Oak() {
		// Won't Work --- type is private
		//type = "tree";
		
		//This works -- Because size is protected, Oak is subclass of Plant
		size = "large";
		
		//No access specifier; Works because Oak and Plant are in the same package
		height = 10;
		
		
	}

}
