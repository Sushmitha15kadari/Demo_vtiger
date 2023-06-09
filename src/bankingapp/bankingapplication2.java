package bankingapp;

public class bankingapplication2 {
		
		static int currentBalance = 1000;
		
		public void greetCustomer(String name)
		{
			System.out.println("Hi " +name+ " Welcome to HDFC bank");
		}
		
		public void deposit(int amount)
		{
			currentBalance = currentBalance + amount;
			System.out.println(amount+" Deposited Succesfully in the Account");
		}
		
		public void Withdrawl(int amount)
		{
			
			
			if((currentBalance>=amount) && (amount>0))
			{	
				System.out.println(amount+" Withdrawled Succesfully from the Account");	
				currentBalance = currentBalance + amount;
			}
			
			
			else 
			{
			System.out.println(amount+" Withdrawled not Succesfully from the Account");
	}
			
			
		}
		public void getBalance()
		
		{
			System.out.println("The current balance in the account: "+currentBalance);
		}
		
		
		public static void main(String[] args) {
			
			bankingapplication2	 ba = new bankingapplication2();
			ba.greetCustomer("Nikitha");
			ba.deposit(2000);
			ba.getBalance();
			ba.Withdrawl(1000);
			
		}

	}


