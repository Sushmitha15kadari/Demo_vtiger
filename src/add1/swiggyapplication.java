package add1;

import java.util.Scanner;

public class swiggyapplication {
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		System.out.println(" enter the user name");
		String username=sc.nextLine();
		System.out.println(" enter the password");
		String password=sc.nextLine();
		if(username.equals("kadari")&&password.equals("sushmitha"))
		{
			System.out.println(" login into application sucessfully");
		}
		else
		{
			System.out.println(" invalid credentials");
		}
		
	}

}
