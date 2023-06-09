package variables;

public class BankApp {
	  
			
			static int currentBalance = 1000;
			public static void greetCustomer()
			{
				System.out.println("Hello, Welcome To Cannara Bank");
			}
			
			public void deposit (int amount)
			{
				currentBalance = currentBalance + amount;
				System.out.println("Amount Deposited Succesfully");
			}
			
			public static void Withdrawal (int amount)
			{
				currentBalance = currentBalance - amount;
				System.out.println("Amount Withdrawaled Succesfully");
			}
			
			public int getCurrentBalance()
			{
				return currentBalance;
			}
			
			public static void main(String[] args) {
				
				BankApp ba = new BankApp();
				greetCustomer();
				System.out.println("Customer Balance is: "+ba.getCurrentBalance());
				ba.deposit(500);
				System.out.println("Customer Balance is: "+ba.getCurrentBalance());
				BankApp.Withdrawal(500);
				System.out.println("Customer Balance is: "+ba.getCurrentBalance());
			}

		}

