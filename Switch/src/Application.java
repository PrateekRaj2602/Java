import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
        String line;
		Scanner variable = new Scanner(System.in);
		System.out.println("Enter any positive integer: ");
		line = variable.nextLine();
		
		switch(line) {
		case "Yes":
		System.out.println("True!!");
		break;
		
		case "No":
		System.out.println("False");
		
		default:
		System.out.println("Try something else Baby!");
		}

	}
}
			