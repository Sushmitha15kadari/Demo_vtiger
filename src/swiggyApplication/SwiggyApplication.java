package swiggyApplication;

import java.util.Scanner;

public class SwiggyApplication {
	
	
	public static void main(String[] args) {
		SwiggyApplication b=new SwiggyApplication();
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the username");
		String username=sc.nextLine();
		System.out.println(" Enter the password  ");
		String password=sc.nextLine();
		if(username.equals("q")  &&  password.equals("qw")) 
		{
		System.out.println("login into application sucessfully ");	
		b.greetCustomer();
		SwiggyApplication.Items("IDLY");
		SwiggyApplication.addcard("IDLY");
		SwiggyApplication.Orderplacing("IDLY");
		b.logout();
		}
		else {
			System.out.println("invalid credentials ");
		}
	}
	public void greetCustomer()
	{
		System.out.println("Hi ,Welcome to Swiggy Application");
	}
	public static void Items(String Items)
	{
		if (Items.equals("DRINK")  || Items.equals("IDLY") || Items.equals("PANIPURI"))
		{
			System.out.println(Items+  "    Item  Selected");
		}
		else
		{
			System.out.println( Items+  "   No Iteam Available");
		}
	}
	public static void addcard(String carditems)
	{
		if(carditems.equals("IDLY")||carditems.equals("DRINK")||carditems.equals("PANIPURI")) 
		{
			System.out.println( carditems    + "   additem to card");
		}
		else {
			System.out.println( carditems     +"    additem not in list card ");
		}
	}
	public static void Orderplacing(String Orderplacing)
	{
		if (Orderplacing.equals("DRINK")  || Orderplacing.equals("IDLY") || Orderplacing.equals("PANIPURI"))
		{
			System.out.println(Orderplacing + "   Orderplaced sucessfully");
		}
		else
		{
			System.out.println( Orderplacing + "  Order not placed");
		}
	}
	public void logout()
	{
		System.out.println("logout  from SwiggyApplication sucessfully ");
	}
	
}



