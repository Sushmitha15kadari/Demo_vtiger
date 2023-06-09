package gmail;
import java.util.Scanner;


public class gmail2 {
	 {
		
		static String Password;
		static String Email;
		
		/**
		 * This Method used to Create an Account in the Gmail application
		 */
		public void createAccount()
		{
			Scanner sc  = new Scanner(System.in);
			System.out.println("Enter First Name: ");
			String FirstName = sc.next();
			System.out.println(FirstName);
			
			System.out.println("Enter Last Name: ");
			String LastName = sc.next();
			System.out.println(LastName);
			
			System.out.println("Enter Email: ");
		    Email = sc.next();
			System.out.println(Email);
			
			System.out.println("Enter Password: ");
			Password = sc.next();
			System.out.println(Password);
				
			System.out.println("Gmail Account Created Sccessfully");
			sc.close();
		}
		
		
		/**
		 * This Method is used to greet the Customer
		 */
		public void greetCustomer()
		{
			System.out.println("Hi ,Welcome to gmail Application");
		}

		public static void main(String[] args) {
			
			Gmail g = new Gmail();
			g.createAccount();
			System.out.println("Enter Username: ");
			System.out.println(Email);
			System.out.println("Enter Password: ");
			System.out.println(Password);
			if(Email.equals("susmitha@gmail.com") && Password.equals("susmitha"))
			{
				System.out.println("Logged into Gmail Application");
				g.greetCustomer();
			}
			else
			{
				System.out.println("Invalid Credentials");
			}
		}
			
	}

}
