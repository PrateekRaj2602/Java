
public class Robot {

	private int id;

	Robot(int id) {
		this.id = id;
	}

	private class Brain { // Nested Class or Non static inner class : acess to the instance data of robot class

		public void think() {
			System.out.println("Robot is thinking.. " + id);
		}

	}

	public static class Battery {// Static inner class : acess to only static instance of outer Class
		public void charge() {
			System.out.println("Battery charging.." );
		}
		
	}
	
	public void start() {
		System.out.println("Robot is starting: " + id);
		Brain brain = new Brain();
		brain.think();
		
		 final String name = "Robot";
		
 class Temp{// local class : acess to local data only if it's final but it can refer to instance data 
			                        
			public void doSomething() {
				
				System.out.println("Id is " + id);
				System.out.println("My name is : " + name);
			}
			
		}
		
  Temp temp = new Temp();
  temp.doSomething();
	}

}
