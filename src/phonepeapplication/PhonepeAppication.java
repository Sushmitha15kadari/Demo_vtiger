package phonepeapplication;

import java.util.Scanner;

public class PhonepeAppication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the username");
		String username=sc.nextLine();
		System.out.println(" Enter the phonenumber");
		String phonenumber = sc.nextLine();
		System.out.println(" Enter the password");
		String password=sc.nextLine();
		PhonepeAppication p=new PhonepeAppication();
		if(username.equals("q")  &&  password.equals("qw")) 
		{
		System.out.println("login into application sucessfully ");
		p.greetCustomer();
		PhonepeAppication.contactselect("ANUSHA");
		p.Paymentpage("ANUSHA");
		p.UPIPIN(2000);
		p.logout();
		}
		else 
		{
				System.out.println("invalid credentials ");
			}
			
		}
	public void greetCustomer()
	{
		System.out.println("Hi ,Welcome to PhoneneApplication");
	}
	
	public static void contactselect(String contactSelect)
	{
	
	if(contactSelect.equals("ANUSHA")||contactSelect.equals("LUCKY")||contactSelect.equals("KADARI"))	
	{
	System.out.println( contactSelect+ " contactselect ");	
	}
	else {
		System.out.println( contactSelect+ " contactselect not at list");	
	}
	}
	public void Paymentpage(String Paymentpage )
	
	{
		if(Paymentpage.equals("ANUSHA")||Paymentpage.equals("LUCKY")||Paymentpage.equals("KADARI"))
		{
		System.out.println(Paymentpage + "  paymentpage is opened");
	}
		else {
			System.out.println(Paymentpage + "  paymentpage is not opened");
		}
			
		}
	public void UPIPIN(int UPIPIN ) 
	{
		
	if(UPIPIN == 2000)
	{
		System.out.println("Transaction Succesfully Completed");
	}
	else
	{
		System.out.println(UPIPIN+ "   Invalid Pin , So Transaction failed");
	}
	}
	public void logout()
	{
		System.out.println("logout  from Phonepe Application sucessfully ");
	}
	

}

		


