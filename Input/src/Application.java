import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		/*System.out.println("Enter the Password: ");
		int password = scanner.nextInt();
		while (password != 121314) {
			System.out.println("enter the correct Password ");
			password = scanner.nextInt();*/
		int password;
		do {
			System.out.println("Enter the Password: ");
			password = scanner.nextInt();
		}while(password != 5);
		System.out.println("Got the correct Password!!!!");
	}
}
