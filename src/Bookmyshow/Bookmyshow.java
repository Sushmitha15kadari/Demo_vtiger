package Bookmyshow;


import java.util.Scanner;



public class Bookmyshow {
	
	static String username;
	static String password;
	static int phonenumber;
	//creataccount//
	public static void main(String[] args)
	{
	//	static String Passed = "Transaction Done Succesfully";
		//static String failed = "Invalid data,Transaction not done Succesfully";
	//	static String Result;//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name");
		String username=sc.nextLine();
		System.out.println("Enter the phonenumber");
		String phonenumber=sc.nextLine();
		System.out.println(" Enter password");
		String password=sc.nextLine();
		System.out.println("Bookmyshow  Account created Succesfully");
		String Accountcreated=sc.nextLine();
	Bookmyshow b=new Bookmyshow();
		b.login();
	//	b.MovieTheaters("INOX");
	//	Bookmyshow.MovieSelection("DADA");
	//	Bookmyshow.SeatSelection(100);
		//Bookmyshow.Payment(2020);
	}
	
	public void login()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name");
		String username=sc.nextLine();
		System.out.println(" Enter password");
		String password=sc.nextLine();
		
		if(username.equals("ka")&&password.equals("kad"))
		{
			System.out.println("login into application sucessfully");
			Bookmyshow b=new Bookmyshow();
			b.MovieTheaters("INOX");
			Bookmyshow.MovieSelection("DADA");
			Bookmyshow.SeatSelection(100);
			Bookmyshow.Payment(2020);
		  		
		}
		else
		{
			System.out.println("invalid credentials");
			
		}
	}	
		public static void MovieSelection(String Movie)
		{
			if (Movie.equals("SIR")  || Movie.equals("RRR") || Movie.equals("DADA"))
			{
				System.out.println(Movie + " movie Selected");
			}
			else
			{
				System.out.println(Movie + " Movie Not available in the List");
			}
		}
			public void MovieTheaters(String Theaters)
			{
				if (Theaters.equals("INOX")  || Theaters.equals("Anand") || Theaters.equals("TIRUMALA"))
				{
					System.out.println( Theaters+ " Theater Selected");
				}
				else
				{
					System.out.println(  Theaters+" Theater Not available in the List");
				}
			}
			public static void SeatSelection(int seatNo)
			{
				if (seatNo>0 || seatNo <= 83)
				{
					System.out.println(seatNo + " is Selected in Lower Class");
				}
				else if (seatNo> 84 || seatNo <= 169)
				{
					System.out.println(seatNo + " is Selected in First Class");
				}
				else if (seatNo> 170 || seatNo <= 250)
				{
					System.out.println(seatNo + " is Selected in Balcony");
				}
				else
				{
					System.out.println(seatNo+" Invalid Seat Number");
				}
			}
			public static void Payment(int UPI_PIN)
			{
				System.out.println("Clicked on pay button");
			System.out.println("Enter UPI PIN");
				if(UPI_PIN == 2020)
				{
					
				//	String Result = Passed;
				//	System.out.println(Result);
					System.out.println("Ticket Booked Succesfully");
				}
				else
				{
					
					//String Result = failed;
				//	System.out.println(Result);
					System.out.println("Ticket Not Booked Succesfully");
				}
			}
			
			
}




