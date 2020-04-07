
public class Machine implements Info{
	public int id = 7;

	public void start() {
		System.out.println("Machine Started");
	}

	public void showInfo() {
		System.out.println("My ID is "+ id);
	}
}
