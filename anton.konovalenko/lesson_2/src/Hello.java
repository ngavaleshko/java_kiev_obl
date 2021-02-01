import java.util.Scanner;

public class Hello {
	public class Hello {
        
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
		
			System.out.println("Type here your name: ");
			String name = scanner.nextLine();
		
			System.out.println("Type here your surname: ");
                	String surname = scanner.nextLine();
		
			System.out.println("Hello, " + name + " " + surname + "!");
			scanner.close();
        	}
	}
